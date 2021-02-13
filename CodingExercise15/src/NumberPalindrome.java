public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int num = number;

        // loop through the nums checking the last digit and adding it to the begining of reverse
        while (num != 0){
            reverse = (reverse * 10) + (num % 10);
            num = num / 10;
        }
        // check if reverse is the same as the number
        return reverse == number;
    }
}
