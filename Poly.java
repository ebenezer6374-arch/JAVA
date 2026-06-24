public class Poly{

static String shop_name = "arunkumar";
static int shop_no = 24;

String prod_name;
int price;

public static void main(String[] args)
{
    //memory ref of a class
    Poly prouduct1 = new Poly();
    prouduct1.prod_name = "abc";
    prouduct1.price = 100;

    Poly prouduct2 = new Poly();
    prouduct2.prod_name = "xyz";
    prouduct2.price = 1000;

//    Shop prouduct3 = new Shop();
//    Shop prouduct4 = new Shop();

    System.out.println(prouduct2.price);
    System.out.println(prouduct1.price);
}


}
