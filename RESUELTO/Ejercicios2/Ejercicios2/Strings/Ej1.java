//Contar cuántas vocales tiene una palabra o frase.

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra o frase: ");
        String texto = sc.nextLine();
        int vocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            //indexOf devuelve -1 si el caracter c no se encuentra en la cadena de vocales
            // devuelve 0 si el caracter es una vocal
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vocales++;
            }
        }

        System.out.println("La cantidad de vocales es: " + vocales);
        sc.close();
    }
}
