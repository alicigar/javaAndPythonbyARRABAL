public class evenOdd{
    public static void main(String[] args){
        boolean result = evenOdd(15);
        if (result){
            System.out.println("It is even ");
        } else{
            System.out.println("It is odd ");
        }
    }
    public static boolean evenOdd(int num){
        return num % 2 == 0;
    }
}