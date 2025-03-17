import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class listarArchivos {
    public static void main(String[] args) {
        Path ruta = Path.of("MiDirectorio");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(ruta)) {
            System.out.println("Archivos en " + ruta + ":");
            for (Path archivo : stream) {
                System.out.println(archivo.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error al listar archivos: " + e.getMessage());
        }
    }
}
