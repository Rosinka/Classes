package hw;

import java.util.Scanner;

public class Work3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Array elements:");

        arrSum(scan, size, arr);

        System.out.println("noRem1: ");
        double noRem1 = scan.nextDouble();
        System.out.println("noRem2: ");
        double noRem2 = scan.nextDouble();

        noRem(noRem1, noRem2);

        System.out.println("even1: ");
        double even1 = scan.nextDouble();
        System.out.println("even2: ");
        double even2 = scan.nextDouble();

        chetko(even1, even2);

        System.out.println("char: ");

        hasInt(scan);

        System.out.println("");    

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

    public static void noRem(double a, double b) {
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
        System.out.println(sum);
    }

}
