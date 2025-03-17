import java.io.*;

public class writeFile{
    public static void main (String[] args){
        String content = "This is an example for the exercise. ";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"))){
            writer.write(content);
            writer.newLine();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}