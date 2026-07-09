import javax.imageio.IIOException;
import java.io.*;

public class July10{
    public static void main (String[] args) throws IOException {
        File file = new File("/home/buddingdeveloper/Desktop/Gpt product/ram.text");
        file.createNewFile();


        FileWriter pen = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(pen);
        writer.write("karthik");
        writer.write("Ganesh");
        writer.close();

        FileReader read =new FileReader(file);
        BufferedReader ch = new BufferedReader(read);

        String str = ch.readLine();
        while (str!= null){
            System.out.println(str);
            str = ch.readLine();
        }

    }
}