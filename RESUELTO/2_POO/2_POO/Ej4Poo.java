class Contador {
    public static int cuenta = 0;

    public static void incrementar() {
        cuenta++;
    }
}

public class Ej4Poo {
    public static void main(String[] args) {
        Contador.incrementar();
        Contador.incrementar();
        System.out.println("Cuenta: " + Contador.cuenta);
    }
}
