interface Volador {
    void volar();
}

class Pajaro implements Volador {
    public void volar() {
        System.out.println("El pájaro está volando.");
    }
}

public class Ej6Poo {
    public static void main(String[] args) {
        Volador miPajaro = new Pajaro();
        miPajaro.volar();
    }
}
