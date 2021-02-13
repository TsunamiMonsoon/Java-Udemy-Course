package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAString = "2020.125";
        System.out.println("numberAString = " + numberAString);

        double number = Double.parseDouble(numberAString);
        System.out.println("number = " + number);

        numberAString +=1;
        number += 1;

        System.out.println("numberAString = " + numberAString);
        System.out.println("number = " + number);


    }
}
