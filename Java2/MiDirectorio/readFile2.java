import java.nio.file.*;
import java.io.*;
import java.util.List;

public class readFile2 {
    public static void main(String[] args){
        Path path = Paths.get("file.txt");
        try{
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
