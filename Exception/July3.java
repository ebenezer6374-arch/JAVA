//package learnString;

public class July3{
    int no;
    String st;
    int price;

    public July3(int no, String st, int price) {
        this.no = no;
        this.st = st;
        this.price = price;
    }
//    public July3() {
//
//    }
    public static void main(String[] args) {
        July3 h1 = new July3(25,"kambar st",30);
        July3 h2 = new July3(30,"seran st",50);
        h2.comparePrice(h1);
    }

    public void comparePrice(July3 h) {
        System.out.println(this.price);
        System.out.println(h.price);

    }


}