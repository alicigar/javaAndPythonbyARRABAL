//Crea una función llamada imprimirDatos() que reciba dos parámetros (un nombre y una edad)
// e imprima un mensaje con esos datos. La función no retorna ningún valor.

public class Ej2 {
    public static void main(String[] args) {
        imprimirDatos("Juan", 25); // Llamada a la función con dos parámetros
    }

    public static void imprimirDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
