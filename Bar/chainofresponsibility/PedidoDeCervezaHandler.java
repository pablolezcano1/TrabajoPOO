package chainofresponsibility;

import model.Bebida;

public class PedidoDeCervezaHandler extends PedidoHandler {
    @Override
    public void manejarPedido(String pedido, Bebida bebida) {
        if (pedido.equalsIgnoreCase("cerveza")) {
            System.out.println("Sirviendo una cerveza");
        } else {
            pasarAlSiguiente(pedido, bebida);
        }
    }
}
