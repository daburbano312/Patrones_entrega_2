package punto_1.ApuestasDecorator.src.decoradores;

import src.interfaces.Apuesta;

public class ApuestaConBono extends ApuestaDecorator {
    private double porcentajeBono;

    public ApuestaConBono(Apuesta apuesta, double porcentajeBono) {
        super(apuesta);
        this.porcentajeBono = porcentajeBono;
    }

    @Override
    public double calcularGanancia() {
        return super.calcularGanancia() * (1 + porcentajeBono);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con bono del " + (porcentajeBono * 100) + "%";
    }
}
