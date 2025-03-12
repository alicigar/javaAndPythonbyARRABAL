import java.util.Scanner;

public class numArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Put a list of numbers please: ");
        int n = scanner.nextInt();
        int[] num = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.print("Put a number: " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }
        System.out.print("Which number are you looking for? ");
        int wanted = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++){
            if (num[i] == wanted){
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Yes, the number is on the list ");
        } else {
            System.out.println("No, the number is not on the list ");
        }

        scanner.close();
        }
    }