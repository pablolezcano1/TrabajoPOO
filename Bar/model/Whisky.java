package model;

public class Whisky extends Trago {
    public Whisky(String nombre, Bebida bebidaBase) {
        super(nombre, bebidaBase);
    }

    @Override
    public String descripcion() {
        return "Whisky  de " + bebidaBase.getNombre();
    }
}
