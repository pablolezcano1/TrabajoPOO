package model;

public class TragoConcreto extends Trago {

    public TragoConcreto(String nombre, Bebida bebidaBase) {
        super(nombre, bebidaBase);
    }

    @Override
    public String descripcion() {
        return "Descripción del trago concreto";
    }
}
