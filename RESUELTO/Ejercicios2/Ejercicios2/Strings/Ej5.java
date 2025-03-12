//Concatenar dos palabras y verificar la longitud total.

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = sc.nextLine();

        String concatenada = palabra1 + palabra2;

        System.out.println("La palabra concatenada es: " + concatenada);
        System.out.println("La longitud total de la palabra concatenada es: " + concatenada.length());
        
        sc.close();
    }
}
