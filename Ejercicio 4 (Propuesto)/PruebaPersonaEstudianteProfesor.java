public class PruebaPersonaEstudianteProfesor {
    public static void main(String[] args) {

        // Crear una persona
        Persona persona1 = new Persona("Carlos Pérez", "Calle 10 #20-30");
        System.out.println("=== Persona ===");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Dirección: " + persona1.getDireccion());
        persona1.setDireccion("Avenida Principal #50-60");
        System.out.println("Nueva dirección: " + persona1.getDireccion());
        System.out.println();

        // Crear un estudiante
        Estudiante estudiante1 = new Estudiante("Ana Gómez", "Carrera 5 #15-25", "Ingeniería de Sistemas", 5);
        System.out.println("=== Estudiante ===");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Dirección: " + estudiante1.getDireccion());
        System.out.println("Carrera: " + estudiante1.getCarrera());
        System.out.println("Semestre: " + estudiante1.getSemestre());
        estudiante1.setSemestre(6);
        System.out.println("Nuevo semestre: " + estudiante1.getSemestre());
        System.out.println();

        // Crear un profesor
        Profesor profesor1 = new Profesor("Luis Mendoza", "Calle 80 #45-67", "Matemáticas", "Catedrático");
        System.out.println("=== Profesor ===");
        System.out.println("Nombre: " + profesor1.getNombre());
        System.out.println("Dirección: " + profesor1.getDireccion());
        System.out.println("Departamento: " + profesor1.getDepartamento());
        System.out.println("Categoría: " + profesor1.getCategoria());
        profesor1.setCategoria("Titular");
        System.out.println("Nueva categoría: " + profesor1.getCategoria());
    }
}