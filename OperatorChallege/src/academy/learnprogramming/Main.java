package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double num1 = 20.00d;
        double num2 = 80.00d;
        double result = (num1 + num2) * 100.00d;
        System.out.println("My result = " + result);
        result = result % 40.00d;
        System.out.println("Result = " + result);
        boolean isNoRemainder = (result == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
