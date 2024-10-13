package punto_1.ApuestasDecorator.src.componentes;

import src.interfaces.Apuesta;

public class ApuestaSimple implements Apuesta {
    private String deporte;
    private double monto;
    private double cuota;

    public ApuestaSimple(String deporte, double monto, double cuota) {
        this.deporte = deporte;
        this.monto = monto;
        this.cuota = cuota;
    }

    @Override
    public double calcularGanancia() {
        return monto * cuota;
    }

    @Override
    public String getDescripcion() {
        return "Apuesta simple en " + deporte + " de $" + monto;
    }
}