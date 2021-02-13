package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer (){
        this("Default name", 100, "email@email.com");
    }
    public VipCustomer (String name, double creditLimit) {
        this(name, creditLimit, "email@email.com");
    }
    public VipCustomer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public double getCreditLimit() {
        System.out.println("Credit limit: " + creditLimit);
        return creditLimit;
    }

    public String getEmail() {
        System.out.println("Email: " + email);
        return email;
    }
}
