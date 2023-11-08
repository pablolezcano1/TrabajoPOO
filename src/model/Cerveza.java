package model;

public class Cerveza extends Bebida {
    public Cerveza(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String descripcion() {
        return "Cerveza " + nombre;
    }
}
