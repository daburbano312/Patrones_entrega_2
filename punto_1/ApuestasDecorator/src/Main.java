package punto_1.ApuestasDecorator.src;


import punto_1.ApuestasDecorator.src.componentes.ApuestaSimple;
import punto_1.ApuestasDecorator.src.decoradores.ApuestaCombinada;
import punto_1.ApuestasDecorator.src.decoradores.ApuestaConBono;
import src.interfaces.Apuesta;

public class Main {
    public static void main(String[] args) {
        
        Apuesta apuestaSimple = new ApuestaSimple("Fútbol", 100, 2.0);
        System.out.println(apuestaSimple.getDescripcion());
        System.out.println("Ganancia: $" + apuestaSimple.calcularGanancia());

        System.out.println("\n---\n");

        Apuesta apuestaConBono = new ApuestaConBono(apuestaSimple, 0.1);
        System.out.println(apuestaConBono.getDescripcion());
        System.out.println("Ganancia: $" + apuestaConBono.calcularGanancia());

        System.out.println("\n---\n");

        // Crear apuesta combinada
        ApuestaCombinada apuestaCombinada = new ApuestaCombinada(apuestaConBono);
        apuestaCombinada.agregarApuesta(new ApuestaSimple("Tenis", 50, 1.5));
        System.out.println(apuestaCombinada.getDescripcion());
        System.out.println("Ganancia: $" + apuestaCombinada.calcularGanancia());
    }
}