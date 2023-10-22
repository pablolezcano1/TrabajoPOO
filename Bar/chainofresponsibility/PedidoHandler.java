package chainofresponsibility;

import model.Bebida;

public abstract class PedidoHandler {
    private PedidoHandler siguienteHandler;

    public void establecerSiguienteHandler(PedidoHandler siguienteHandler) {
        this.siguienteHandler = siguienteHandler;
    }

    public abstract void manejarPedido(String pedido, Bebida bebida);

    protected void pasarAlSiguiente(String pedido, Bebida bebida) {
        if (siguienteHandler != null) {
            siguienteHandler.manejarPedido(pedido, bebida);
        } else {
            System.out.println("Lo siento, no podemos manejar el pedido de " + pedido);
        }
    }
}
