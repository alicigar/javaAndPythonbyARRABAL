public class pareNone{
    public static void main (String[] args){
        int num = 8;
        if (esPar(num)){
            System.out.println(num + " es par ");
        } else {
            System.out.println(num + " es impar ");
        }
    }
    public static boolean esPar(int num){
        return num % 2 == 0;
    }
}