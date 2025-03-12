import java.util.Scanner;

public class exerciseFour{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("N: ");
        int N = scanner.nextInt();

        int suma = N * (N + 1) / 2;

        System.out.println (suma);
        scanner.close();
    }
}