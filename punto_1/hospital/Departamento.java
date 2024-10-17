package punto_1.hospital;

public abstract class Departamento {
    protected SistemaDeRegistro sistema;

    public Departamento(SistemaDeRegistro sistema) {
        this.sistema = sistema;
    }

    public void registrarPaciente(String paciente) {
        sistema.guardarDatos(paciente);
    }

    public void generarInforme() {
        sistema.extraerDatos();
    }

    public abstract void realizarTareaEspecifica();
}