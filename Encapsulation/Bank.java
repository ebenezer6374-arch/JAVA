// File: Main.java

// Encapsulated Class
class BankAccount {
    // 1. Private data members (Data Hiding)
    private String accountHolder;
    private double balance;

    // Constructor to initialize variables
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Reusing the setter to apply validation logic during initialization
        setBalance(initialBalance);
    }

    // 2. Public Getter for Account Holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public Setter for Account Holder
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Account holder name cannot be empty.");
        }
    }

    // 3. Public Getter for Balance (Controlled Read Access)
    public double getBalance() {
        return balance;
    }

    // 4. Public Setter for Balance (Controlled Write Access with Validation)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative. Setting balance to 0.0");
            this.balance = 0.0;
        }
    }
}

// Main Class to execute the program
class Main {
    public static void main(String[] args) {
        // Create an object using the constructor
        BankAccount myAccount = new BankAccount("    ", 1000.0);

        // Accessing data through public getter methods
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Modifying data using public setter methods
        System.out.println("\n--- Attempting valid modifications ---");
        myAccount.setBalance(1500.50);
        System.out.println("Updated Balance: $" + myAccount.getBalance());

        // Testing data validation constraints
        System.out.println("\n--- Attempting invalid modifications ---");
        myAccount.setBalance(-500.0); // Triggers validation logic
        System.out.println("Current Safe Balance: $" + myAccount.getBalance());

        // Directly accessing private fields will cause a compilation error
        // myAccount.balance = -100; // UNCOMMENTING THIS WILL BREAK THE CODE
    }
}
