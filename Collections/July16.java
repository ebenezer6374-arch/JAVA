import java.util.ArrayList;
import java.util.Collections;

public class July16 implements Comparable<July16>{

    String name;
    int price;
    int rating;

    public July16(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "July16{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(July16 obj) {
        System.out.println(this.name+" - "+obj.name);
        if(this.rating > obj.rating) {
            return 48;
        }else if(this.rating < obj.rating) {
            return -373;
        }else {
            return 0;
        }
    }



}


class CompareJuly16 {
    public static void main (String[] args){
        ArrayList al = new ArrayList();
//        al.add("xyz");
//        al.add("abc");

        al.add(new July16("maggi" , 20 , 5));
        al.add(new July16("Yippee" , 25 , 4));

        Collections.sort(al);
        System.out.println(al);
    }
}