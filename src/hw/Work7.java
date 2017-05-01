package hw;

import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.Arrays;

/**
 * Created by lana on 01.02.17.
 */
public class Work7 {
    public static void main(String[] args) {

        int[] arrayRand = Work3.arrayRand();
        System.out.println(partArray(arrayRand, 2, 5));
        evenArray(106, 120);

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


}
