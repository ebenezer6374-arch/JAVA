import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

class July13{
    public static void main (String[] args){
        int sum = 0;
        try (BufferedReader  reader = new BufferedReader(new FileReader("/home/buddingdeveloper/Desktop/Java Practice/FileHandling/sum.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                int number  =Integer.parseInt(line.trim());
                sum += number;
            }
            System.out.println(sum);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}