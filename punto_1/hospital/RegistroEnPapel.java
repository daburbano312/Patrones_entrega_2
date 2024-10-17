package punto_1.hospital;

public class RegistroEnPapel implements SistemaDeRegistro {
    @Override
    public void guardarDatos(String paciente) {
        System.out.println("Guardando datos de " + paciente + " en papel");
    }

    @Override
    public void extraerDatos() {
        System.out.println("Extrayendo datos de archivos en papel");
    }
}
