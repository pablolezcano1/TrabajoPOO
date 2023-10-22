package controller;

import model.Bebida;
import model.Trago;
import chainofresponsibility.PedidoDeCervezaHandler;
import chainofresponsibility.PedidoHandler;
import singleton.BarSingleton;
import builder.BebidaBuilder;
import builder.TragoBuilder;

public class BarController {
    private BarSingleton barSingleton;
    private PedidoHandler pedidoHandler = new PedidoDeCervezaHandler();

    public BarController() {
        barSingleton = BarSingleton.getInstance();
    }

    public void procesarPedido(String pedido) {

        Bebida bebida = new BebidaBuilder()
                .setNombre("Cerveza")
                .setPrecio(5.99)
                .build();

        Trago trago = new TragoBuilder()
                .setNombre("Whisky")
                .setBebidaBase(bebida)
                .build();

        pedidoHandler.manejarPedido(pedido, bebida);

        barSingleton.servirBebida(pedido);
    }

    public void procesarPedidoTrago(String pedido) {

        Bebida bebidaBase = new BebidaBuilder()
                .setNombre("Cerveza")
                .setPrecio(5.99)
                .build();

        pedidoHandler.manejarPedido(pedido, bebidaBase);

        if (pedido.equalsIgnoreCase("martini")) {
            Trago martini = new TragoBuilder()
                    .setNombre("Martini")
                    .setBebidaBase(bebidaBase)
                    .build();
            System.out.println("¡Preparando un Martini!");
        }

        barSingleton.servirBebida(pedido);
    }

}
