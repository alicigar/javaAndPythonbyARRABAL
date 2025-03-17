import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LeerArchivoNIO {
    public static void main(String[] args) {
        Path ruta = Path.of("archivo.txt"); // Ruta del archivo

        try {
            List<String> lineas = Files.readAllLines(ruta);
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
