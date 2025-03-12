//Pedir un número y mostrar su tabla de multiplicar del 1 al 10.


import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");

        //que pasa si pongo println en la linea anterior ???

        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
        sc.close();
    }
}
