package day01_tasks;

public class Finra {

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
}
