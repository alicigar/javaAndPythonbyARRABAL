//Pedir un número y determinar si es primo.

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        boolean esPrimo = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        sc.close();
        System.out.println(num + (esPrimo ? " es primo." : " no es primo."));
    }
}
