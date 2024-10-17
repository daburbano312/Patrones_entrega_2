package punto_1.ApuestasDecorator.src.decoradores;

import src.interfaces.Apuesta;
import java.util.ArrayList;
import java.util.List;

public class ApuestaCombinada extends ApuestaDecorator {
    private List<Apuesta> apuestasAdicionales;

    public ApuestaCombinada(Apuesta apuestaBase) {
        super(apuestaBase);
        this.apuestasAdicionales = new ArrayList<>();
    }

    public void agregarApuesta(Apuesta apuesta) {
        apuestasAdicionales.add(apuesta);
    }

    @Override
    public double calcularGanancia() {
        double gananciaTotal = super.calcularGanancia();
        for (Apuesta apuesta : apuestasAdicionales) {
            gananciaTotal *= apuesta.calcularGanancia();
        }
        return gananciaTotal;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + apuestas combinadas";
    }
}
