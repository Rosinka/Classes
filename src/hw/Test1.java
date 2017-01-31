package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 3 digits");
        int number = scan.nextInt();
        System.out.println("enter 1 digit");
        int second = scan.nextInt();
        System.out.println("Array: ");
        int[] newDigits = digits(number, second);
        result(newDigits, second);
    }

    public static void result (int[] digits, int second) {
        switch (second) {
            case 1:
                System.out.println(Arrays.toString(digits));
                break;
            case 2:
                System.out.println(Work3.arraySum(digits));
                break;
            case 3:
                System.out.println(Work4.isoscelesTriangle(digits[1], digits[2], digits[3]));
                break;
            default:
                System.out.println("Not correct second element");
        }
    }

    public static int[] digits (int number, int second) {
        int[] digits = Work4.digits(number);
        digits = insertElement(digits, second, 1);
        System.out.println(Arrays.toString(digits));
        return digits;
    }

    private static int[] insertElement(int original[], int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1, length - index);
        return destination;
    }

}
