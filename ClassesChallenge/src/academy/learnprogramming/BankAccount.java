package academy.learnprogramming;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // constructors
    public BankAccount(){
        this(12356789, 12345, "Default name", "Default email", 1234567890);
        System.out.println("Empty constructor called.");
    }
    public BankAccount (int accountNumber, double balance, String customerName,
                        String email, int phoneNumber) {
        System.out.println("Bank Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(9999, 1105.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber () {
        return this.accountNumber;
    }
    public void setBalance (int balance) {
        this.balance = balance;
    }
    public double getBalance () {
        return this.balance;
    }
    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName () {
        return this.customerName;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public String getEmail () {
        return this.email;
    }
    public void setPhoneNumber (int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber () {
        return this.phoneNumber;
    }
    public double depositFunds (int deposit) {
        double newFunds = deposit + getBalance();
        System.out.println("New balance is: " + newFunds);
        return newFunds;
    }
    public double withdrawFunds (int withdraw) {
        double newFunds = getBalance() - withdraw;
        if (withdraw > getBalance()) {
            System.out.println("Cannot withdraw more than your balance");
        } else {
            System.out.println("New balance is: " + newFunds);
        }
        return newFunds;
    }
}
