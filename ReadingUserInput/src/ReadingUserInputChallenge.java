import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) { // endless loop  till the break statement
            int order = counter + 1; // could prolly do counter += 1; instead ??
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) { // make sure that the entered value is an int
                int num = scanner.nextInt();
                counter++;
                sum += num;
                if (counter == 10){
                    break; // break out of the loop once the counter reaches 10
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line a.k.a enter key
        }
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
