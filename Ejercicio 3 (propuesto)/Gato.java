public class Gato extends Mascota {
    protected float alturaSalto;
    protected float longitudSalto;

    public Gato(String nombre, int edad, String color, float alturaSalto, float longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }
}
