import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        boolean first = true;

        while (true){
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) { // check if it's an int
                int num = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = num;
//                    max = num;
//                }
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }

        System.out.println("Min = " + min + ", Max = " + max);

        scanner.close();
    }
}
