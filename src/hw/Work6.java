package hw;

/**
 * Created by lana on 31.01.17.
 */

import java.util.ArrayList;
import java.lang.String;

public class Work6 {
    public static void main(String[] args) {

        System.out.println(fibRecMethod(1));
        System.out.println(fibSumMethod(7));
        System.out.println(factorial(5));
        System.out.println(nearFact(20));
        System.out.println(isNumeric("cc"));
        System.out.println(getNumeric("12354"));
        ArrayList<Integer> newNum = getNumeric("1234567");
        numFromString("vv222vv343");
    }

    private static ArrayList<Integer> numFromString(String str) {
        ArrayList<Integer> finalNumber = new ArrayList<Integer>();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (isDigit(charArray[i])) {
                int value = Character.getNumericValue(charArray[i]);
                finalNumber.add(value);
            }
        }
        return finalNumber;
    }

    private static boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    public static ArrayList<Integer> getNumeric(String str) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        if (isNumeric(str)) {
            for (char ch : str.toCharArray()) {
                int i = Character.getNumericValue(ch);
                num.add(i);
            }
        }
        return num;
    }

    public static boolean isNumeric(String str) {
        return str.matches("[+-]?\\d*(\\.\\d+)?");
    }

    public static int nearFact(int n) {
        int index = 1, buff = 1;
        while (factorial(index) < n) {
            index++;
            buff = factorial(index);
        }

        return (buff - n > n - factorial(index - 1)) ? factorial(index - 1) : factorial(index);
    }

    public static int[] factArr(int n) {
        int[] factArr = new int[n];
        for (int i = 0; i < n; i++) {
            factArr[i] = factorial(i);
        }
        return factArr;
    }

    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static int fibSumMethod(int pos) {
        if (pos <= 0) {
            return 0;
        }
        if (pos == 1 || pos == 2) {
            return 1;
        }
        int pos1 = 1;
        int i = 1;
        int fibSum = 1;
        while (i < pos) {
            pos1 = fibSum - pos1;
            fibSum = fibSum + pos1;
            i++;
        }
        return fibSum;
    }

    public static int fibRecMethod(int pos) {
        if (pos <= 0) {
            return 0;
        }
        if (pos == 1 || pos == 2) {
            return 1;
        }
        return fibRecMethod(pos - 1) + fibRecMethod(pos - 2);
    }
}
