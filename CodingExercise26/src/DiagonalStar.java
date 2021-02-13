public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        // loop for rows
        for (int i = 0; i < number; i++) {
            // loop for columns
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == (number - 1) || j == 0 || j == (number - 1)) {
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else if (i + j == number-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}