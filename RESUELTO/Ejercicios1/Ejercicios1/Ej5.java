//Calcular el factorial de un número ingresado por el usuario (N!).

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int N = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es: " + factorial);
    }
}
