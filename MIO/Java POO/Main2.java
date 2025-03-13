class sonnyAngel{
    public String name;
    private int age;
    protected String city;
}

public class Main2{
    public static void main(String[] args){
        sonnyAngel s = new sonnyAngel();
        s.name = "Nacho";
        //s.age = 30; error, es privado //
        s.city = "Doujima";

        System.out.println("Name: " + s.name);
        System.out.println("City: " + s.city);
    }
}