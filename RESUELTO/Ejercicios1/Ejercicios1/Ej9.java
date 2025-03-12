// Pedir que se introduzca V o F y si la letra es V que imprima "Verdadero" 
// y "Falso" si se introduce F, que pida otra vez la letra 
// si no es ninguna de las anteriores.

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        boolean valido = false; // Para controlar el bucle

        while (!valido) { // Repite hasta que se ingrese 'V' o 'F'
            System.out.print("Ingresa 'V' para Verdadero o 'F' para Falso: ");
            letra = sc.next().charAt(0); // Lee el primer carácter ingresado

            if (letra == 'V' || letra == 'v') {
                System.out.println("Verdadero");
                valido = true; // Salimos del bucle
            } else if (letra == 'F' || letra == 'f') {
                System.out.println("Falso");
                valido = true; // Salimos del bucle
            } else {
                System.out.println("Entrada no válida. Inténtalo de nuevo.");
            }
        }

        sc.close();
    }
}
