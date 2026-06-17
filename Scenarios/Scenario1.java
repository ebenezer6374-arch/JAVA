public class Scenario1{
    String  dept = "Payilagam";
    String institute = "Java";
    private int salary = 1000;

    public Scenario1 (String i , String j){
        this.dept = i;
        this.institute = j;

                }

    public int getSalary (){
         return this.salary;
        }



    public void training(){
            System.out.println("I am training");
            }

    public static void main (String[] args){
        Scenario1 trainerkumar = new Scenario1("CSE"  ,"Payilagam");

                }

    }

class SQLTrainer extends Scenario1 {

    public SQLTrainer (String i ,String j){
            super(i ,j)  ;
}

            public  static void main (String[] args){
        SQLTrainer ram = new SQLTrainer("SQL" , "PAYILAGAM");
        System.out.println(ram.dept);
        System.out.println(ram.institute);
        ram.training();
        System.out.println(ram.getSalary());
                    }
            }
