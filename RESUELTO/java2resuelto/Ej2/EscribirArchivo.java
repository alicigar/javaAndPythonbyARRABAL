import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "salida.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            System.out.println("Escriba líneas de texto (escriba 'salir' para finalizar):");

            while (true) {
                String linea = sc.nextLine();
                if (linea.equalsIgnoreCase("salir")) {
                    break;
                }
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Texto guardado en " + ruta);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
