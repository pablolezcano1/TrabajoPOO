package model;

public class Gaseosa extends Bebida {
    public Gaseosa(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String descripcion() {
        return "Gaseosa " + nombre;
    }
}
