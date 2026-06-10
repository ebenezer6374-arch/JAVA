//import java.util.Scanner;
//
//public class Armstrong{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        int original = n;
//        int temp = n;
//        int count = 0;
//        int sum = 0;
//
//        // Find number of digits
//        while (temp > 0) {
//            count++;
//            temp = temp / 10;
//        }
//
//        temp = n;
//
//        // Calculate sum of digits raised to the power of count
//        while (temp > 0) {
//            int digit = temp % 10;
//            sum += (int) Math.pow(digit, count);
//            temp = temp / 10;
//        }
//
//        // Check Armstrong number
//        if (sum == original) {
//            System.out.println("Armstrong Number");
//        } else {
//            System.out.println("Not an Armstrong Number");
//        }
//
//        sc.close();
//    }
//}


import java.util.Scanner;
public class Armstrong {
        public static void main (String[ ] args){
                Scanner sc = new Scanner (System.in);
                System.out.print("Type a number");
                int n = sc.nextInt();
                int original = n;
                int temp = n;
                int count= 0;
                int sum = 0;


                while (temp >0){
                                count ++;
                                temp = temp /10;

                  }
                    temp = n;

             while (temp >0){
                    int digit = temp %10;
                    sum += (int) Math.pow(digit,count);
                    temp = temp /10;

}
            if (sum ==original){
                            System.out.println("Armstrong");}

  sc.close();

    }
}
