package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, 12345, "TsunamiMonsoon", "TsunamiMonsoon@email.com", 1234567890);

        // no longer needed bc constructor with parameters is called
//        account.setAccountNumber(123456789);
//        account.setBalance(12345);
//        account.setCustomerName("TsunamiMonsoon");
//        account.setEmail("TsunamiMonsoon@email.com");
//        account.setPhoneNumber(1234567890);
        System.out.println("Account number is: " + account.getAccountNumber());
        System.out.println("Balance is: " + account.getBalance());
        System.out.println("Customer name is: " + account.getCustomerName());
        System.out.println("Email is: " + account.getEmail());
        System.out.println("Phone number is: " + account.getPhoneNumber());

        account.depositFunds(1234);
        account.withdrawFunds(1234567);
        account.withdrawFunds(1234);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", 12345);

        VipCustomer vip = new VipCustomer("TsunamiMonsoon", 1000, "TsunamiMonsoon@email.com");
        vip.getCreditLimit();
        vip.getName();
        vip.getEmail();
    }
}
