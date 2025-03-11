import java.util.Scanner;

public class exerciseThree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put a string: ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s", "").toLowerCase();
        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--){
            reversedString += input.charAt(i);
        }
        if (input.equals(reversedString)){
            System.out.println("¡Es un palíndromo!");
            }else {
                System.out.println("No es un palíndromo");
            }
        scanner.close();
    }
}