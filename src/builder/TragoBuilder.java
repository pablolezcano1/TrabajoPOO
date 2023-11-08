package builder;

import model.Bebida;
import model.TragoConcreto;

public class TragoBuilder {
    private String nombre;
    private Bebida bebidaBase;

    public TragoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TragoBuilder setBebidaBase(Bebida bebidaBase) {
        this.bebidaBase = bebidaBase;
        return this;
    }

    public TragoConcreto build() {
        return new TragoConcreto(nombre, bebidaBase);
    }
}
