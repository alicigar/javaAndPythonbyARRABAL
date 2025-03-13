import java.sql.*;
import java.util.Scanner;

public class AlumnoDAO {
    public static void actualizarAlumno(int id, String nuevoNombre) {
        String sql = "UPDATE alumnos SET nombre = ? WHERE id = ?";

        try (Connection conn = ConnectionMySQL.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nuevoNombre);
            pstmt.setInt(2, id);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas actualizadas: " + filasAfectadas);

        } catch (SQLException e) {
            System.out.println("Error al actualizar alumno: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENÚ CRUD - ALUMNOS");
            System.out.println("1. Mostrar todos los alumnos");
            System.out.println("2. Insertar un nuevo alumno");
            System.out.println("3. Actualizar el nombre de un alumno por ID");
            System.out.println("4. Eliminar un alumno por ID");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarAlumnos();
                    break;
                case 2:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edad = scanner.nextInt();
                    insertarAlumno(nombre, edad);
                    break;
                case 3:
                    System.out.print("Ingrese ID del alumno: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    actualizarAlumno(idActualizar, nuevoNombre);
                    break;
                case 4:
                    System.out.print("Ingrese ID del alumno a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    eliminarAlumno(idEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarAlumnos() {
        String sql = "SELECT id, nombre, edad FROM alumnos";

        try (Connection conn = ConnectionMySQL.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nLISTA DE ALUMNOS:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener alumnos: " + e.getMessage());
        }
    }

    public static void insertarAlumno(String nombre, int edad) {
        String sql = "INSERT INTO alumnos (nombre, edad) VALUES (?, ?)";

        try (Connection conn = ConnectionMySQL.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setInt(2, edad);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas insertadas: " + filasAfectadas);

        } catch (SQLException e) {
            System.out.println("Error al insertar alumno: " + e.getMessage());
        }
    }

    public static void eliminarAlumno(int id) {
        String sql = "DELETE FROM alumnos WHERE id = ?";

        try (Connection conn = ConnectionMySQL.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas eliminadas: " + filasAfectadas);

        } catch (SQLException e) {
            System.out.println("Error al eliminar alumno: " + e.getMessage());
        }
    }
}
