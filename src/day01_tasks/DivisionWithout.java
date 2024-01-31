package day01_tasks;

public class DivisionWithout {

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


}
