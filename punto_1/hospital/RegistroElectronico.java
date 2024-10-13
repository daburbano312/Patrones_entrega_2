package punto_1.hospital;

public class RegistroElectronico implements SistemaDeRegistro {
    @Override
    public void guardarDatos(String paciente) {
        System.out.println("Guardando datos de " + paciente + " electrónicamente");
    }

    @Override
    public void extraerDatos() {
        System.out.println("Extrayendo datos del sistema electrónico");
    }
}
