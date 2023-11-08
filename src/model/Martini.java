package model;

public class Martini extends Trago {
    public Martini(String nombre, Bebida bebidaBase) {
        super(nombre, bebidaBase);
    }

    @Override
    public String descripcion() {
        return "Martini de " + bebidaBase.getNombre();
    }
}
