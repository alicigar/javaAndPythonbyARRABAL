import java.util.Scanner;

public class countnumArray {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put a list of numbers please ");
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        int[] num = new int[parts.length];

        for (int i = 0; i < parts.length; i++){
            num[i] = Integer.parseInt(parts[i]);
        }
        System.out.print("Put a number: ");
        int wanted = scanner.nextInt();

        int counter = 0;
        for (int numb : num){
            if (numb == wanted){
                counter++;
            }
        }
        System.out.println("The number " + wanted + " appears " + counter + " times in the list");

        scanner.close();
    }
}