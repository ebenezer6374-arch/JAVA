//import java.util.Arrays;
//public class PracticeProblems{
//
//    public  static int Duplicates (int [] nums){
//        int i = 0;
//        for (int j =1; j < nums.length; j++){
//            if (nums[j] != nums [i]){
//                    i++;
//                    nums [i] = nums[j];
//            }
//
//        }
////        System.out.println("Hey");
//        System.out.println(i +1);
//        return i +1;
//
//    }
//     public  static void main (String[] args){
//
////       System.out.println( Arrays.toString(newArr));
////       System.out.println(newArr);
//         int [] nums = {10,20,20,30,30,30,30,40,40};
//          int  count = Duplicates(nums);
//
//          for  ( int i =0; i<count; i++){
//              System.out.print(nums[i] + " ");
//          }
//    }
//}

class PractieProblems{
    public static void main (String[] args){
        int [] myArr = {3,8,17,35};
        for (int i = 0; i< myArr.length -1; i++){
            System.out.println("Pair =>" +  myArr[i] + " ," + myArr[i +1]);
            System.out.println("Sum=>" + (myArr[i] + myArr[i+1]));
        }
    }
}