// first challenge
// using the for statement, call the calculateInterest method with
// the amount of 10,000 with an interestRate of 2,3,4,5,6,7, and 8
// and print the results to the console window

// second challenge
// How would you modify the for loop above to do the same thing as
// shown but to start from 8% and work back to 2%

// third challenge
// Create a for statement using any range of numbers
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 2 exit the for loop
// hint: use the break; statement to exit

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calulateInterest(10000, 2));

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Loop " + i + " hello!");
//        } // practice loop
        // solution given for challenge 1
        for (int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        // my solution for challenge 2
        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        // challenge 3 solution
        int count = 0;
        for (int i = 10; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime (int n){
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) { // better way to do i <= n/2 is to cast it as a long then use Math.sqrt(n) (optimization)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        // not as good solution (my OG solution for challenge 1)
//        for (int i = 2; i < 9; i++){
//            amount = 10000;
//            interestRate = i;
//            double sum = (amount * (interestRate / 100));
//            System.out.println(amount + " with interest rate " + interestRate + " = " + sum);
//        }

        return (amount * (interestRate / 100));
    }
}
