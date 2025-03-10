import java.util.Scanner;

public class exerciseSeven{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("put a number: ");
        int num = scanner.nextInt();

        int counter = 0;
        int temp = num;
        while (temp != 0){
            temp /= 10;
            counter++;
        }
        scanner.close();
        System.out.println (counter);
    }
}