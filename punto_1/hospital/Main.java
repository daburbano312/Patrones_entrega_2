package punto_1.hospital;

public class Main {
    public static void main(String[] args) {
        SistemaDeRegistro registroElectronico = new RegistroElectronico();
        SistemaDeRegistro registroEnPapel = new RegistroEnPapel();

        Departamento emergencias = new Emergencias(registroElectronico);
        Departamento pediatria = new Pediatria(registroEnPapel);

        emergencias.registrarPaciente("Juan Pérez");
        emergencias.realizarTareaEspecifica();
        emergencias.generarInforme();

        System.out.println("\n---\n");

        pediatria.registrarPaciente("María García");
        pediatria.realizarTareaEspecifica();
        pediatria.generarInforme();
    }
}
