import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        long avg = 0;

        while (true) { // endless loop
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) { // check if it's an int
                sum += scanner.nextInt(); // add the int into the sum
                count++; // increment
            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg); // print the avg and sum
                break; // break out of the loop
            }
            avg = Math.round((double) sum / count); // cast and round int to double for average
            scanner.nextLine(); // handle input lines
        }
        scanner.close();
    }
}
