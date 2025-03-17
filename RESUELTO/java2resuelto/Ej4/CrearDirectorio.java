import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CrearDirectorio {
    public static void main(String[] args) {
        Path ruta = Path.of("MiDirectorio");

        try {
            if (!Files.exists(ruta)) {
                Files.createDirectory(ruta);
                System.out.println("Directorio creado: " + ruta);
            } else {
                System.out.println("El directorio ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el directorio: " + e.getMessage());
        }
    }
}
