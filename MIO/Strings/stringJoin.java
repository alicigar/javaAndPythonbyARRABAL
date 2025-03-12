import java.util.Scanner;

public class stringJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Put the first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Put the second word: ");
        String secondWord = scanner.nextLine();

        String concatenatedString = firstWord + "" + secondWord;

        int length = concatenatedString.length();

        System.out.print ("The length of the new string is " + length);
        scanner.close();
    }
}