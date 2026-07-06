import java.lang.annotation.Annotation;
import java.util.Arrays;

class July6 {
    public July6(String name) {

    }

    public static void main (String[] args ){
        int num1 =90;
        int num2 = 0;
        try {
            int result = num1/num2;
            System.out.println(result);
        }
        catch (ArithmeticException java) {
            System.out.println(java.getMessage());
            System.out.println(java.getLocalizedMessage());
            System.out.println(java.getCause());
            System.out.println(java.getStackTrace());
            System.out.println(Arrays.toString(java.getSuppressed()));
            System.out.println(java.getClass());
//            System.out.println(java.printStackTrace());
            java.printStackTrace();


            String ab = "ebenezer";
            System.out.println(ab);

            July6 bc = new July6 ("Arun");
            System.out.println(bc);
        }
    }
}