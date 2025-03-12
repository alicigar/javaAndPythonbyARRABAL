//Sumar todos los elementos de un array.

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int suma = 0;

        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma total es: " + suma);
        sc.close();
    }
}
