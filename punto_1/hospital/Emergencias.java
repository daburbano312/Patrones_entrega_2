package punto_1.hospital;

public class Emergencias extends Departamento {
    public Emergencias(SistemaDeRegistro sistema) {
        super(sistema);
    }

    @Override
    public void realizarTareaEspecifica() {
        System.out.println("Evaluando urgencia en Emergencias");
    }
}
