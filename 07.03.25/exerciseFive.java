import java.util.Scanner;

public class exerciseFive{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("N: ");
        int N = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= N; i++){
            factorial *= i;
        }

        System.out.println (factorial);
        scanner.close();
    }
}