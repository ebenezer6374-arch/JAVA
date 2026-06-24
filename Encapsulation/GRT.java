public class GRT
{

//pojo
//plain old java object
private int price  = 14200;


//getter method
public int getPrice(){;
    return this.price;
}

public void setPrice(int price){
    if(price >= this.price)
        this.price = price;
    else
        System.out.println("Amount is less then fixed value");
}




}
