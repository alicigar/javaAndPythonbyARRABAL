//Crea una función llamada duplicar() 
//que reciba un número como parámetro y retorne el doble de ese número.


public class Ej3 {
    public static void main(String[] args) {
        int resultado = duplicar(5); // Llamada a la función con un parámetro
        System.out.println("El doble es: " + resultado);
    }

    public static int duplicar(int numero) {
        return numero * 2;
    }
}
