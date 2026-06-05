class Employee{
void work(){
System.out.println("Employee working");
 }
        }

class Developer extends Employee{
        void work(){
        System.out.println("Developer Writing Code");
    }
}

class Tester extends Employee{
        void work(){
        System.out.println("Tester Testing Application");
        }
}


public class Runtime{

        public static void main(String[] args){

                    Employee a1 = new Developer();
                    Employee a2 = new Tester();


                    a1.work();
                    a2.work();
                }
        }
