import java.util.Scanner;

public class exerciseSix{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("put a number: ");
        
        int N = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println (N + " x " + i + " = " + (N * i));
        }
        scanner.close();
    }
}