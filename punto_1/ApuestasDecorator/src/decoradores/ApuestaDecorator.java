package punto_1.ApuestasDecorator.src.decoradores;

import src.interfaces.Apuesta;

public abstract class ApuestaDecorator implements Apuesta {
    protected Apuesta apuestaBase;

    public ApuestaDecorator(Apuesta apuesta) {
        this.apuestaBase = apuesta;
    }

    @Override
    public double calcularGanancia() {
        return apuestaBase.calcularGanancia();
    }

    @Override
    public String getDescripcion() {
        return apuestaBase.getDescripcion();
    }
}