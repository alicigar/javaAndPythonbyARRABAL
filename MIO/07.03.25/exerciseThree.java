public class exerciseThree {
    public static void main(String[] args){
        int  num1 = 50;
        int  num2 = 100;
        int  num3 = 1;
    
        if (num1 >= num2 && num1 >= num3 )
            System.out.println("the highest number is " + num1);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println("the highest number is " + num2);
        else
            System.out.println("the highest number is " + num3);
    }    
}