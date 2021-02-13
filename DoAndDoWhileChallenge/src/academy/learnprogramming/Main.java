// challenge 1
// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;

// challenge 2
// modify the while code below
// Make it also record the total number of even numbers it has found
// and break once 5 are found
// and at the end display the total number of even numbers found

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100){
//                break;
//            }
//        } while (count != 6);

        int num = 4;
        int finishNum = 20;
        int evenNumsFound = 0; // challenge 2

        while (num <= finishNum) {
            num++;
            if (!isEvenNumber(num)) {
                continue;
            }
            System.out.println("Even number " + num);
            //challenge 2
            evenNumsFound++;
            if (evenNumsFound >= 5){
                break;
            } // end challenge 2
        }
        System.out.println("Total even numbers found = " + evenNumsFound); // challenge 2
    }
    public static boolean isEvenNumber (int num) {
        return (num % 2) == 0;
    }
}
