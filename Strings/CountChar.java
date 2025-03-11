import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }

        System.out.println("The number of vowels is: " + vowelCount);

        scanner.close();
    }
}
