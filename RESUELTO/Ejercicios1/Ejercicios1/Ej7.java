//Pedir un número e indicar cuántos dígitos tiene.

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        int contador = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            contador++;
        }
        sc.close();
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
