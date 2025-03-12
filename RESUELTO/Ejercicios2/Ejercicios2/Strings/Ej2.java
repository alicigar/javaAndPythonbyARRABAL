//Invertir un String.

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        System.out.println("La palabra invertida es: " + invertida);
        sc.close();
    }
}
