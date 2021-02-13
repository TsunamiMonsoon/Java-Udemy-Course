public class SharedDigit {
    public static boolean hasSharedDigit (int num1, int num2) {
        int firstNum = 0;

        // validate nums
        if (((num1 >= 10) && (num1 <= 99)) && ((num2 >= 10) && (num2 <= 99))) {
            firstNum = num1 % 10; // breaking apart num for comparision

            // looping for comparision
            while (num1 > 0) {
                if (num2 %10 == firstNum) {
                    return true;
                }
                if (num2 / 10 == firstNum) {
                    return true;
                }
                // 2nd part of the num
                num1 = num1 / 10;
                firstNum = num1; // setting the 2nd half of num to compare
            }
        }
        return false;
    }
    // better solution
//    public static boolean hasSharedDigit(int num1, int num2) {
//        return ((num1>=10 && num1<=99 && num2>=10 && num2<=99) && (num1/10==num2/10 || num1%10==num2%10 || num1/10==num2%10 || num1%10==num2/10));
//    }
}
