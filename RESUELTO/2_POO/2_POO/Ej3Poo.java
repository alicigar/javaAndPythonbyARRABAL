class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    private int restar(int a, int b) {
        return a - b;
    }

    protected int multiplicar(int a, int b) {
        return a * b;
    }
}

public class Ej3Poo {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(5, 3));
        // System.out.println("Resta: " + calc.restar(5, 3)); // Error, es privado
        System.out.println("Multiplicación: " + calc.multiplicar(5, 3));
    }
}
