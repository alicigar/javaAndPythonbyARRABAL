import java.nio.file.*;
import java.io.*;

public class createDirectory{
    public static void main (String[] args){
        Path path = Paths.get("newDirectory");
        try{
            Files.createDirectory(path);
            System.out.println("The directory was created. ");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}