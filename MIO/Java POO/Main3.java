class Calculator {
    public int plus(int a, int b){
        return a + b;
    }

    private int minus(int a, int b){
        return a - b;
    }
    protected int multiply(int a, int b){
        return a * b;
    }
}

public class Main3{
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println("Plus: " + c.plus(16, 8));
        //System.out.println("Minus: " + c.minus(7, 3)); ES PRIVADO//
        System.out.println("Multiply: " + c.multiply(6, 7));
    }
}