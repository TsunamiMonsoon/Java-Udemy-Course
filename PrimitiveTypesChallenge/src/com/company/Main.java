package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 50;

        long longTotal = 50000L + 50L * (byteVal + shortVal + intVal);
        System.out.println(longTotal);
    }
}
