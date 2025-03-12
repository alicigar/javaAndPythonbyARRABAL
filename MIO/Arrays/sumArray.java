import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers are you gonna sum?: ");
        int n = scanner.nextInt();

        int[] num = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Put a number" + (i + 1) + ": ");
            num[i] = scanner.nextInt();
            sum += num[i];
        }
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}