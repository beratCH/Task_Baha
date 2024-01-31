package day01_tasks;

import java.util.Arrays;

public class Methods {

    public static void OddEven(int number) { // ODD OR EVEN

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    public static void DivisionWithoutOp(double number1, double number2) { // WITHOUT DIVISION

        double result = 0;
        for (double i = 0; i < 35000; i++) {
            if (number1 == i * number2) {
                result = i;
            }
        }

        if (result == 0) {
            System.out.println(number1 + " is not divisible by " + number2);
            return;
        }


        System.out.println("The result is : " + result);

    }


    public static void finra(int number) {

        for (int i = 1; i < 31; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");

            } else if (i % 3 == 0) {
                System.out.println("FIN");

            } else if (i % 5 == 0) {
                System.out.println("RA");

            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        finra(30);


    }


}
