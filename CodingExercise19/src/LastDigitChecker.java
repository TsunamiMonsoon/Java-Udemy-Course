public class LastDigitChecker {
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        // check if the numbers are valid
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)){
            return (num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10); // return if 2 of the last digits equal each other
        }
        return false;
    }
    public static boolean isValid (int number) {
        return ((number >= 10) && (number <= 1000)); // return true if the number is valid
    }
}
