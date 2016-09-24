package hw;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Work3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Array elements:");

        arrSum(scan, size, arr);

        System.out.println("noOst1: ");
        double noOst1 = scan.nextDouble();
        System.out.println("noOst2: ");
        double noOst2 = scan.nextDouble();

        noOst(noOst1, noOst2);

        System.out.println("even1: ");
        double even1 = scan.nextDouble();
        System.out.println("even2: ");
        double even2 = scan.nextDouble();

        chetko(even1, even2);

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
            x1 = (-b + sqrt(d)) / 2 * a;
            x2 = (-b - sqrt(d)) / 2 * a;
            System.out.println("D > 0\nRoots: x1 = " + x1 + "\n       x2 = " + x2);
        } else if (d == 0) {
            x1 = -b / 2 * a;
            x2 = -b / 2 * a;
            System.out.println("D = 0\nRoots: x1 = " + x1 + "\n       x2 = " + x2);
        } else {
            System.out.println("D < 0\nNo roots");
        }
    }

    public static void hasInt(Scanner scan) {
        if (scan.hasNextInt() == true) {
            System.out.println("it`s int");
        } else {
            System.out.println("no int - no fun");
        }
    }

    public static void chetko(double c, double d) {
        if ((c % 2) == 0 & (d % 2) == 0) {
            System.out.println("4isla 4etkie");
        } else if ((c % 1) == 0 & (d % 1) == 0) {
            System.out.println("4isla ne 4etkie");
        }
    }

    public static void noOst(double a, double b) {
        if (a % b == 0) {
            System.out.println("taki da!");
        } else {
            System.out.println("nea");
        }
    }

    public static void arrSum(Scanner input, int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("Array element sum: " + sum);
    }

}
