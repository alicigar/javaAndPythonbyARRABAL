// Leer tres números y determinar cuál es el mayor.

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int c = sc.nextInt();

        int mayor = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("El mayor es: " + mayor);

        sc.close();
    }
}
