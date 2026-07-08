abstract  class July8{
    abstract void processPayment (double amount);

    void printReceipt (){
        System.out.println ("Receipt generated successfully");
    }


//    public abstract void equals();
}

class CreditcardPayment extends July8{
    void processPayment(double amount){
        System.out.println(amount);
    }



}


class PaypalPayment extends July8{
    void processPayment (double amount){
        System.out.println(amount);
    }
}


 class Main {
   public static void main(String[] args) {
        July8 hp = new CreditcardPayment ();
        hp.processPayment(167);
        hp.printReceipt();
//       int i = hp.hashCode();
//       System.out.println(i);
//       hp.equals();


       July8 ph = new PaypalPayment();
        ph.processPayment(89089);
        ph.printReceipt();


    }
}


