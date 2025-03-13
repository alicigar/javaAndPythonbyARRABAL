class dog{
    String name;
    int age;
}

public class Main{
    public static void main (String[] args){
        dog myDog = new dog();
        myDog.name = "Pipo";
        myDog.age = 3;

        System.out.println("Name: " + myDog.name);
        System.out.println("Age: " + myDog.age);
    }
}