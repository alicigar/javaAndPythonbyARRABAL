//Buscar un número en un array.

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingresa el número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + buscar + " fue encontrado.");
        } else {
            System.out.println("El número " + buscar + " NO fue encontrado.");
        }

        sc.close();
    }
}

