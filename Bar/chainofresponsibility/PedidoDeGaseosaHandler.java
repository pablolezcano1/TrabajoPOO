package chainofresponsibility;

import model.Bebida;

public class PedidoDeGaseosaHandler extends PedidoHandler {
    @Override
    public void manejarPedido(String pedido, Bebida bebida) {
        if (pedido.equalsIgnoreCase("gaseosa")) {
            System.out.println("Preparando una gaseosa");
        } else {
            pasarAlSiguiente(pedido, bebida);
        }
    }
}


