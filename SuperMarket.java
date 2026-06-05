public class SuperMarket
{
String name = "python";
int price;

public SuperMarket(String productname,int price){
    System.out.println("are you constructor?");
    name = productname;
    price = price;
}
//constructor name should be same as class name
//No return type req
//Called automatically when object is created
//initializing object specific values

public static void main(String[] args)
{
    SuperMarket product1 = new SuperMarket("abc",20);
    SuperMarket product2 = new SuperMarket("xyz",2000);

    System.out.println(product1.name);
    System.out.println(product2.name);
//    product1.name = "abc";
//    product1.price = 20;
//    product2.name = "xyz";
//    product2.price = 2000;

}


}
