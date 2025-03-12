//Reemplazar una letra en una frase.

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingresa la letra a reemplazar: ");
        char letraAntigua = sc.next().charAt(0);

        System.out.print("Ingresa la nueva letra: ");
        char letraNueva = sc.next().charAt(0);

        String nuevaFrase = frase.replace(letraAntigua, letraNueva);

        System.out.println("La nueva frase es: " + nuevaFrase);
        sc.close();
    }
}
