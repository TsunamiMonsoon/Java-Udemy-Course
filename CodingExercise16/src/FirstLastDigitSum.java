public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        int firstDigit = 0;
        int lastDigit = 0;
        int count = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            // finds the 1st digit in the loop
            firstDigit = number % 10;

            if (count == 0) { // make sure we get the least significant digit, the one to the right
                lastDigit = number % 10;
                count++;
            }
            // drop the least significant digit
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
