package builder;

import model.BebidaConcreta;

public class BebidaBuilder {
    private String nombre;
    private double precio;

    public BebidaBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public BebidaBuilder setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public BebidaConcreta build() {
        return new BebidaConcreta(nombre, precio);
    }
}
