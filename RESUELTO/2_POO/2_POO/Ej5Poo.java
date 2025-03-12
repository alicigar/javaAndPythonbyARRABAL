abstract class Animal {
    public abstract void hacerSonido();
}

class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class Ej5Poo {
    public static void main(String[] args) {
        Animal miGato = new Gato();
        Animal miPerro = new Perro();

        miGato.hacerSonido();
        miPerro.hacerSonido();
    }
}
