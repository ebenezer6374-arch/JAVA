import   java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class July11 {
    private String name;
    private int age;
    private String city;

    public July11(String name , int age ,String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String toString (){
        return name  + age +city;
    }
}

class Main{
    public static void main (String[] args){
        List <July11> people = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/buddingdeveloper/Desktop/Java Practice/FileHandling/people.txt"))){
            String line;
            while ((line= reader.readLine() )!= null){
                String [] data  = line.split(",");
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                String city = data[2].trim();

                July11   ch = new July11(name,age,city);
                people.add(ch);

            }
        }

        catch (IOException e){
            e.printStackTrace();
        }

        for (July11 ch : people){
            System.out.println(ch);
        }

    }
}