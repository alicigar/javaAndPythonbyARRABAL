//Contar cuántas veces aparece un número en un array.

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingresa el número a contar: ");
        int buscar = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] == buscar) {
                contador++;
            }
        }

        System.out.println("El número " + buscar + " aparece " + contador + " veces.");
        sc.close();
    }
}
