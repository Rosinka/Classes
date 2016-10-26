package hw;

import java.util.Scanner;

public class Work3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        arraySumRandom();

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println(noRem(num1, num2));

        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();

        System.out.println(evenCheck(num3, num4));

//        String charStr = scan.next();

//        for (char ch : charStr.toCharArray())
//            System.out.println(intCheck(ch));

        double arguments[] = new double[3];
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = scan.nextDouble();
        }

        roots(arguments);
    }

    public static void roots(double arguments[]) {
        double d = Math.pow(arguments[1], 2) - 4 * arguments[0] * arguments[2];
        if (d > 0) {
            double x1 = (-arguments[1] + Math.sqrt(d)) / 2 * arguments[0];
            double x2 = (-arguments[1] - Math.sqrt(d)) / 2 * arguments[0];
            System.out.println(x1 + x2);
        } else if (d == 0) {
            double x1 = -arguments[1] / 2 * arguments[0];
            double x2 = -arguments[1] / 2 * arguments[0];
            System.out.println(x1 + x2);
        } else {
            System.out.println("no real roots");
        }
    }

    public static boolean intCheck(char symbol) {
        char[] allDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < allDigits.length; i++) {
            if (symbol == allDigits[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean evenCheck(double c, double d) {
        return noRem(c, 2) & noRem(d, 2);
    }

    public static boolean noRem(double a, double b) {
        return (a % b == 0);
    }

    public static void arraySumRandom() {
        int myArray[] = new int[10];
        int arraySum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
            arraySum += myArray[i];
        }

        System.out.println(arraySum);
    }

}
