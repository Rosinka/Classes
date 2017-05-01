package hw;

import java.util.Arrays;

import static hw.Work4.len;

/**
 * Created by lana on 01.02.17.
 */
public class Work7 {
    public static void main(String[] args) {

//        int[] arrayRand = Work3.arrayRand();
//        System.out.println(partArray(arrayRand, 2, 5));
//        evenArray(106, 120);
        evenDigit(552647499);

    }

    public static String partArray(int[] arr, int srcPos, int length) {
        int[] arrPart = new int[length];
        System.arraycopy(arr, srcPos, arrPart, 0, length);
        System.out.println(Arrays.toString(arr));
        return Arrays.toString(arrPart);
    }

    public static void evenArray(int firstDigit, int secondDigit) {
        int[] array = new int[secondDigit];
        for (int i = firstDigit - 1; i < secondDigit; i++) {
            array[i] = i + 1;
            if ((array[i] % 2) == 0) {
                System.out.println("Even element = " + array[i]);
            }
        }
    }

    private static int[] digits(int number) {
        int length = len(number);
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[length - 1 - i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static void evenDigit(int number) {
        int[] digits = digits(number);
        int min = digits[0];
        int max = digits[0];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < min) {
                min = digits[i];
            } else if (digits[i] > max) {
                max = digits[i];
            }
        }
        System.out.println("Max value - " + max);
        System.out.println("Min value - " + min);
        if ((max + min) % 2 == 0) {
            System.out.println("max + min = " + (max + min) + " :: Even");
        } else {
            System.out.println("max + min = " + (max + min) + " :: Not even");
        }
    }
}
