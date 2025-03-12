import java.util.Scanner;

public class lowhighnumArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put a list of numbers please : ");
        int n = scanner.nextInt(); 
        
        int[] num = new int[n];
        System.out.print("Put a number ");
        num[0] = scanner.nextInt();
        int min = num[0];
        int max = num[0];

        for (int i = 1; i < n; i++){
            System.out.print("Put a number " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
            min = Math.min(min, num[i]);
            max = Math.max(max, num[i]);
        }
        System.out.println("The lowest number is: " + min);
        System.out.println("The highest number is: " + max);

        scanner.close();
    }
}