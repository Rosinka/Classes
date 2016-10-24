package hw;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Work3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        int arr[] = new int[];
//        System.out.println("Array elements:");
//
//        arrSum(scan, arr);

        System.out.println("noOst1: ");
        double noOst1 = scan.nextDouble();
        System.out.println("noOst2: ");
        double noOst2 = scan.nextDouble();

        noRem(noOst1, noOst2);

        System.out.println("even1: ");
        double even1 = scan.nextDouble();
        System.out.println("even2: ");
        double even2 = scan.nextDouble();

        evenCheck(even1, even2);

        System.out.println("char: ");

        hasInt(scan);

        System.out.println("eqA: ");
        double eqA = scan.nextDouble();
        System.out.println("eqB: ");
        double eqB = scan.nextDouble();
        System.out.println("eqC: ");
        double eqC = scan.nextDouble();

        eqRoots(eqA, eqB, eqC);

    }

    public static void eqRoots(double a, double b, double c) {

        double x1, x2;
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            x1 = getX1(a, b, d);
            x2 = (-b - sqrt(d)) / 2 * a;
            System.out.println("D > 0\nRoots: x1 = " + x1 + "\n       x2 = " + x2);
        } else if (d == 0) {
            x1 = -b / 2 * a;
            System.out.println("D = 0\nRoot: x = " + x1);
        } else {
            System.out.println("D < 0\nNo roots");
        }

    }

    public static double getX1(double a, double b, double d) {
        double x1;
        x1 = (-b + sqrt(d)) / 2 * a;
        return x1;
    }

    public static void hasInt(Scanner scan) {
        if (scan.hasNextInt() == true) {
            System.out.println("it`s int");
        } else {
            System.out.println("no int - no fun");
        }
    }

    public static boolean evenCheck(double c, double d) {
        return noRem(c, 2) & noRem(d, 2);
    }

    public static boolean noRem(double a, double b) {
        return (a % b == 0);
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
