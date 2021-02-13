public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            int reversedNum = reverse(number);
            int digitCount = getDigitCount(reversedNum);

            do {
                switch (reversedNum % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNum /= 10;
            } while (reversedNum != 0);

            while (digitCount < getDigitCount(number)) {
                System.out.println("Zero");
                digitCount++;
            }
        }
    }
    public static int reverse (int number) {
        int reversedNum = 0;
        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number /= 10;
        }
        return reversedNum;
    }
    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number !=0);
        return count;
    }
}
