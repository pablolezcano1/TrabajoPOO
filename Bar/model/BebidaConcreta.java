package model;

public class BebidaConcreta extends Bebida {

    public BebidaConcreta(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String descripcion() {
        return "Descripción de la bebida concreta"; // Implementa la descripción de la bebida
    }
}
