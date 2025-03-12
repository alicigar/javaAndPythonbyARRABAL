//Determinar si una palabra es un palíndromo.

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        if (palabra.equals(invertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra NO es un palíndromo.");
        }

        sc.close();
    }
}
