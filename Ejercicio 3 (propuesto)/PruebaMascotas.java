public class PruebaMascotas {
    public static void main(String[] args) {

        // Perros Pequeños
        Caniche caniche = new Caniche("Boby", 3, "Blanco", 4.5f, false);
        YorkshireTerrier yorkshire = new YorkshireTerrier("Lucas", 2, "Café", 3.2f, true);
        Schnauzer schnauzer = new Schnauzer("Max", 5, "Negro con gris", 4.0f, false);
        Chihuahua chihuahua = new Chihuahua("Tina", 1, "Amarillo", 2.8f, true);

        // Perros Medianos
        Collie collie = new Collie("Rex", 4, "Blanco y negro", 25.0f, false);
        Dalmata dalmata = new Dalmata("Copito", 6, "Blanco con manchas negras", 28.0f, true);
        Bulldog bulldog = new Bulldog("Rocky", 3, "Gris", 22.0f, true);
        Galgo galgo = new Galgo("Veloz", 2, "Café claro", 20.0f, false);
        Sabueso sabueso = new Sabueso("Bruno", 5, "Marrón", 24.0f, true);

        // Perros Grandes
        PastorAleman pastor = new PastorAleman("Thor", 4, "Negro y marrón", 35.0f, true);
        Doberman doberman = new Doberman("Akira", 3, "Negro", 30.0f, true);
        Rotweiller rotweiller = new Rotweiller("Hércules", 4, "Marrón", 32.0f, true);

        // Gatos Sin Pelo
        Esfinge esfinge = new Esfinge("Pelado", 2, "Piel rosada", 1.5f, 2.0f);
        Elfo elfo = new Elfo("Luz", 3, "Blanco", 1.7f, 2.1f);
        Donskoy donskoy = new Donskoy("Dany", 4, "Beige", 1.6f, 1.9f);

        // Gatos de Pelo Largo
        Angora angora = new Angora("Snow", 2, "Blanco", 1.8f, 2.3f);
        Himalayo himalayo = new Himalayo("Kitty", 3, "Blanco con gris", 1.6f, 2.0f);
        Balines balines = new Balines("Nieve", 5, "Blanco", 1.7f, 2.2f);
        Somali somali = new Somali("Sombra", 2, "Café", 1.6f, 2.0f);

        // Gatos de Pelo Corto
        AzulRuso azulRuso = new AzulRuso("Oscar", 4, "Azul", 1.4f, 1.9f);
        Britanico britanico = new Britanico("Tom", 3, "Negro", 1.5f, 2.0f);
        Manx manx = new Manx("Peluche", 2, "Marrón claro", 1.6f, 1.8f);
        DevonRex devonRex = new DevonRex("Duque", 3, "Café oscuro", 1.7f, 2.1f);

        // Mostrar información de los animales

        System.out.println("=== SONIDOS ===");
        Perro.sonido(); // Todos los perros ladran
        Gato.sonido();  // Todos los gatos maúllan y ronronean
        System.out.println();

        System.out.println("=== PERROS PEQUEÑOS ===");
        imprimirMascota(caniche);
        imprimirMascota(yorkshire);
        imprimirMascota(schnauzer);
        imprimirMascota(chihuahua);

        System.out.println("\n=== PERROS MEDIANOS ===");
        imprimirMascota(collie);
        imprimirMascota(dalmata);
        imprimirMascota(bulldog);
        imprimirMascota(galgo);
        imprimirMascota(sabueso);

        System.out.println("\n=== PERROS GRANDES ===");
        imprimirMascota(pastor);
        imprimirMascota(doberman);
        imprimirMascota(rotweiller);

        System.out.println("\n=== GATOS SIN PELO ===");
        imprimirMascota(esfinge);
        imprimirMascota(elfo);
        imprimirMascota(donskoy);

        System.out.println("\n=== GATOS DE PELO LARGO ===");
        imprimirMascota(angora);
        imprimirMascota(himalayo);
        imprimirMascota(balines);
        imprimirMascota(somali);

        System.out.println("\n=== GATOS DE PELO CORTO ===");
        imprimirMascota(azulRuso);
        imprimirMascota(britanico);
        imprimirMascota(manx);
        imprimirMascota(devonRex);
    }

    // Método auxiliar para mostrar información común de cualquier mascota
    private static void imprimirMascota(Mascota mascota) {
        System.out.println(mascota.toString());
    }
}