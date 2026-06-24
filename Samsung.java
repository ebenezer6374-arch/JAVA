
public class Samsung extends Mobile

{

public Samsung(){
        System.out.println("Hey");
}



public static void main (String[] args){
Mobile mobile = new Mobile();
mobile.call();
//mobile.msg();
//Samsung samsung = new Samsung();
//mobile.touch();
//samsung.call();
mobile.msg();
}
public void touch(){
System.out.println("touch");
}
}
