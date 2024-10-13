package punto_1.hospital;

public class Pediatria extends Departamento {
    public Pediatria(SistemaDeRegistro sistema) {
        super(sistema);
    }

    @Override
    public void realizarTareaEspecifica() {
        System.out.println("Programando vacunación en Pediatría");
    }
}