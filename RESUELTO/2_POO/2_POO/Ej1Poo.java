class Perro {
    String nombre;
    int edad;
}

public class Ej1Poo {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.nombre = "Firulais";
        miPerro.edad = 3;
        
        System.out.println("Nombre: " + miPerro.nombre);
        System.out.println("Edad: " + miPerro.edad);
    }
}
