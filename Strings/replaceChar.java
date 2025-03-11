import java.util.Scanner;

public class replaceChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put a string: ");
        String input = scanner.nextLine();

        System.out.print ("Put a letter you would like to replace ");
        char oldLetter = scanner.next().charAt(0);

        System.out.print("Put a new letter for replace ");
        char newLetter = scanner.next().charAt(0);
        
        String result = input.replace(oldLetter, newLetter);
        System.out.println ("The new string is: " + result);

        scanner.close();
    }
}