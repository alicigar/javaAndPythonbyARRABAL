abstract class Animal{
    public abstract void makeSound();
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Wuuuuuf");
    }
}

public class Main5{
    public static void main(String[] args){
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.makeSound();
        myDog.makeSound();
    }
}