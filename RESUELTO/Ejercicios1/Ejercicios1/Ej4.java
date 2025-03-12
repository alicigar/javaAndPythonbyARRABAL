//Pedir un número N y calcular la suma de los primeros N números naturales (1 + 2 + ... + N).

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int N = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
    }
}
