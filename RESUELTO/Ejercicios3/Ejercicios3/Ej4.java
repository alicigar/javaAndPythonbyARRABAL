//Crea una función llamada esPar() que reciba un número como parámetro
// y retorne true si el número es par, o false si el número es impar.

public class Ej4 {
    public static void main(String[] args) {
        boolean resultado = esPar(8); // Llamada a la función con un parámetro
        if (resultado) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0; // Retorna true si el número es par
    }
}
