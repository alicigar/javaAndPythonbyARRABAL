class Persona {
    public String nombre; // Accesible desde cualquier lugar
    private int edad; // Solo accesible dentro de la clase
    protected String ciudad; // Accesible en la misma clase, subclases y mismo paquete
}

public class Ej2Poo{
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Carlos"; // Correcto (es público)
        // p.edad = 25; // Error, es privado
        p.ciudad = "Madrid"; // Correcto, estamos en el mismo paquete

        System.out.println("Nombre: " + p.nombre);
        System.out.println("Ciudad: " + p.ciudad);
    }
}
