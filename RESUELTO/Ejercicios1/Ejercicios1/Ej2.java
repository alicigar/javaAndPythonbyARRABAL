// Pedir un número al usuario y mostrar si es par o impar.
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        System.out.println(num % 2 == 0 ? "Es par" : "Es impar");

        sc.close();
    }
}
