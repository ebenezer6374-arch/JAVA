class Bank {
    private String holder;
    private int balance;

    public Bank(String holder, int initBalnce) {
        this.holder = holder;
        setBalance(initBalnce);
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        if (holder != null && !holder.trim().isEmpty()) {
            this.holder = holder;
        } else {
            System.out.println("Hey write some valid name");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("hey put some vaild amount");
        }
    }
}


class Main{
    public static void main (String[] args){
        Bank ac = new Bank ("eben", 89000);

        System.out.println(ac.getHolder());
        System.out.println(ac.getBalance());
        ac.setHolder("hannah");
        System.out.println(ac.getHolder());
        ac.setBalance(-90);
        System.out.println(ac.getBalance());
    }
}