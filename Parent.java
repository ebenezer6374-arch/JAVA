package salem;
public class Parent
{
//public => class method constructor variables
//private => constructor variables method
//default(__) => class variable constructor method
public Parent(int i){

}

public Parent(){}

public int atmPin = 1234;

public static void main(String[] args)
{
Parent pp = new Parent(10);
    pp.makeBiriyani();
    pp.checkBalance();
    System.out.println(pp.atmPin);
}

protected void makeBiriyani(){
    System.out.println("biriyani");
}

protected void checkBalance(){
    System.out.println("15000");
}

}



