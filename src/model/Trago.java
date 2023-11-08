package model;

public abstract class Trago {
    protected String nombre;
    protected Bebida bebidaBase;

    public Trago(String nombre, Bebida bebidaBase) {
        this.nombre = nombre;
        this.bebidaBase = bebidaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public Bebida getBebidaBase() {
        return bebidaBase;
    }

    public abstract String descripcion();
}
