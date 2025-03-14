import java.sql.*;
import java.util.Scanner;

public class JDBCAlumnos {
    private static final String URL = "jdbc:mysql://localhost:3306/escuela";
    private static final String USER = "root"; // Cambia por tu usuario de MySQL
    private static final String PASSWORD = ""; // Si tienes contraseña, agrégala aquí

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ CRUD - ALUMNOS");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Actualizar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> agregarAlumno(sc);
                case 2 -> mostrarAlumnos();
                case 3 -> actualizarAlumno(sc);
                case 4 -> eliminarAlumno(sc);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }

    // Método para agregar un alumno
    private static void agregarAlumno(Scanner sc) {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad del alumno: ");
        int edad = sc.nextInt();

        String sql = "INSERT INTO alumnos (nombre, edad) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setInt(2, edad);
            stmt.executeUpdate();
            System.out.println("Alumno agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar alumno: " + e.getMessage());
        }
    }

    // Método para mostrar todos los alumnos
    private static void mostrarAlumnos() {
        String sql = "SELECT * FROM alumnos";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nLista de Alumnos:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " (" + rs.getInt("edad") + " años)");
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar alumnos: " + e.getMessage());
        }
    }

    // Método para actualizar el nombre de un alumno
    private static void actualizarAlumno(Scanner sc) {
        System.out.print("Ingrese el ID del alumno a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = sc.nextLine();

        String sql = "UPDATE alumnos SET nombre = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nuevoNombre);
            stmt.setInt(2, id);
            int filasActualizadas = stmt.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Alumno actualizado correctamente.");
            } else {
                System.out.println("No se encontró un alumno con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar alumno: " + e.getMessage());
        }
    }

    // Método para eliminar un alumno
    private static void eliminarAlumno(Scanner sc) {
        System.out.print("Ingrese el ID del alumno a eliminar: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM alumnos WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int filasEliminadas = stmt.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Alumno eliminado correctamente.");
            } else {
                System.out.println("No se encontró un alumno con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar alumno: " + e.getMessage());
        }
    }
}
