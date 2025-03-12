//Encontrar el número mayor y menor en un array.

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        sc.close();
    }
}
