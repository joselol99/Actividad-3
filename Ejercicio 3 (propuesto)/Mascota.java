public class Mascota {
    protected String nombre;
    protected int edad;
    protected String color;

    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    @Override
    public String toString() {
        return nombre + " (" + color + "), " + edad + " años";
    }
}
