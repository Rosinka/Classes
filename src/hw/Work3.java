package hw;

import java.util.Scanner;

public class Work3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        arraySumRandom();

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println("noRem" + noRem(num1, num2));

        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();

        System.out.println("evenCheck" + evenCheck(num3, num4));
        System.out.println("intCheck num4" + intCheck('3'));
        System.out.println("intCheck 'a'" + intCheck('a'));

        for (int i = 0; i < roots(2, 1, -2).length; i++) {
            System.out.println("Roots = " + roots(2, 1, -2)[i]);
        }

    }

    public static double[] roots(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return null;
        }
        if (a == 0) {
            return new double[]{-c / b};
        }
        if (a == 0 && b == 0 && c != 0) {
            return new double[]{0, -b / a};
        }
        if (a != 0 && b == 0 && c <= 0) {
            return new double[]{-Math.sqrt(-c / a), Math.sqrt(-c / a)};
        }
        if (a != 0 && b == 0 && c > 0) {
            return null;
        }
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d == 0) {
            return new double[]{-b / (2 * a)};
        }
        if (d > 0) {
            return new double[]{-b - Math.sqrt(d) / (2 * a), -b + Math.sqrt(d) / (2 * a)};
        } else {
            return null;
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

    public static int arraySum(int[] myArray) {
        int arraySum = 0;
        for (int i = 0; i < myArray.length; i++) {
            arraySum += myArray[i];
        }
        return arraySum;
    }

}
