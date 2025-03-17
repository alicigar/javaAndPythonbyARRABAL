import java.io.*;

public class readFile{
    public static void main(String[] args){
        String route = "file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(route))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}