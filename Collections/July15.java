import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class July15{
    String id;
    int rollNo;
    String name;
    public July15(String id , int rollNo ,String name){
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){
                return
                        "id='" + id + '\'' +
                        ", rollNo=" + rollNo +
                        ", name='" + name + '\'';
    }
}
class Rank{
    public static void main (String[]  args){
        ArrayList al = new ArrayList();
        al.add("hey");
        al.add(new July15("1" , 101 , "ebenezer"));
        al.add(new July15("2" , 102 , "kathirvel"));
        al.add(new July15("3" , 103 , "vinayagam"));
        al.add(new July15("4" , 104 , "dhanraj"));
        al.add(new July15("5" , 105 , "bala"));
        System.out.println(al);
        for (Object obj : al){
            System.out.println(obj);
        }
    }
}


//class Arraypractice {
//    public static void main (String [] args){
////         int[] numbers = new int[]{67 ,87,89,94,35};
////         int newValue = 40;
//////            System.out.println(numbers[7]);
////        int[] numbers2 = Arrays.copyOf(numbers , numbers.length +1);
////        numbers2 [numbers2.length-1] = newValue;
////         System.out.println(Arrays.toString(numbers));
////        System.out.println(Arrays.toString(numbers2));
//
//        int [] numbers = {67 ,876,35,99,93};
//        int insert = 2;
//        int newValue = 999;
//
//        int[] newNumbers = new int[numbers.length +1];
//        for (int i=0; i < insert; i++){
//            newNumbers[i] = numbers[i];
//        }
//        newNumbers[insert ] = newValue;
//
//        for (int i = insert ; i < numbers.length; i++){
//            newNumbers[i +1] = numbers[i];
//        }
//
//        System.out.println(Arrays.toString(newNumbers));
//    }
//
//}