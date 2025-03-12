import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put a string: ");
        String input = scanner.nextLine();

        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--){
            reversedString += input.charAt(i);
        }

        System.out.println ("The string is: " + reversedString);

        scanner.close();
    }
}