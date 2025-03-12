// Invertir el contenido de un array.

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        // Invertir el array
        for (int i = 0; i < n / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temp;
        }

        System.out.println("El array invertido es:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
