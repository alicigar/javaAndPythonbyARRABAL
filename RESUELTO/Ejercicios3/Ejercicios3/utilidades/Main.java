package utilidades; // Declaramos que esta clase también pertenece al paquete

public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases del paquete
        Saludador saludo = new Saludador();
        saludo.saludar();

        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 3);
        System.out.println("La suma es: " + resultado);
    }
}
