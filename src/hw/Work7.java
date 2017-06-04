package hw;

import java.util.ArrayList;
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
//        evenDigit(552647499);
//        System.out.println(isPalindromeNumber(arrayToInt(removeMaxElementNumber(1234773721))));
//        numbersOfAP(129, 999);
        System.out.println(decToBinFloat(9.15));

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

    public static void evenMinMaxSumNumber(int number) {
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

    public static void numbersOfAP(int firstNumber, int secondNumber) {
        int[] array = new int[secondNumber - firstNumber - 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = firstNumber + i;
            if (checkAP(array[i]) == true) {
                System.out.println(array[i]);
            }
        }
    }

    private static boolean checkAP(int array) {
        int[] arrayElement = digits(array);
        int differenceAP = arrayElement[1] - arrayElement[0];
        for (int i = 2; i < arrayElement.length; i++) {
            if (!((arrayElement[i] - arrayElement[i - 1]) == differenceAP)) {
                return false;
            }
        }
        return true;
    }

    public static int maxDigit(int number) {
        int[] digits = digits(number);
        int max = digits[0], maxIndex = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > max) {
                max = digits[i];
//                maxIndex = i;
            }
        }
        return max;
    }

    public static int[] removeMaxElementNumber(int number) {
        int maxDigit = maxDigit(number);
        int[] digits = digits(number);
        int[] digitsNew = new int[0];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != maxDigit) {
                digitsNew = addElement(digitsNew, digits[i]);
            }
        }

        return digitsNew;
    }

    private static int arrayToInt(int[] array) {
        StringBuilder strNum = new StringBuilder();

        for (int num : array) {
            strNum.append(num);
        }
        int finalInt = Integer.parseInt(strNum.toString());
        return finalInt;
    }

    private static int[] addElement(int[] array, int element) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static ArrayList<Long> decToBin(long decNumber) {
        ArrayList<Long> binDigits = new ArrayList<Long>();
        while (decNumber > 0) {
            long binDigit = decNumber % 2;
            decNumber /= 2;
            binDigits.add(0, binDigit);
        }
        return binDigits;
    }

    public static String decToBinFloat(double decNumber) {
        double fracPart = decNumber - (long) decNumber;
        ArrayList<Long> fracBinDigits = new ArrayList<Long>();
        for (int i = 0; i < 10; i++) {
            fracPart *= 2;
            long fracBinDigit = (long) fracPart;
            fracBinDigits.add(fracBinDigits.size(), fracBinDigit);
            if (fracBinDigit >= 1) {
                fracPart -= fracBinDigit;
            }
        }
        ArrayList<Long> intPartToBin = decToBin((long) decNumber);
        return listLongToString(intPartToBin) + "," + listLongToString(fracBinDigits);
    }

    private static String listLongToString(ArrayList<Long> list) {
        StringBuilder sb = new StringBuilder();
        for (Long x : list) {
            sb.append(x.toString());
        }
        return String.valueOf(sb);
    }

}
