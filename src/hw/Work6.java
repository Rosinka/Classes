package hw;

/**
 * Created by lana on 31.01.17.
 */

import java.lang.String;

public class Work6 {
    public static void main(String[] args) {

        System.out.println(fibRecMethod(1));
        System.out.println(fibSumMethod(7));
        System.out.println(factorial(5));
        System.out.println(nearFact(20));
        System.out.println(isNumeric("177833r"));
        System.out.println(getNumeric("45678"));
        System.out.println(numFromString("vv222vv343"));
    }

    public static int numFromString(String str) {
        char[] charArray = str.toCharArray();
        int res = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (isDigit(charArray[i])) {
                res = res * 10 + Character.getNumericValue(charArray[i]);
            }
        }
        return res;
    }

    public static int getNumeric(String str) {
        char[] charArray = str.toCharArray();
        int res = 0;
        if (!isNumeric(str)) {
            return -1;
        }
        for (int i = 0; i < charArray.length; i++) {
            res = res * 10 + Character.getNumericValue(charArray[i]);
        }
        return res;
    }

    public static boolean isNumeric(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (!isDigit(charArray[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    public static int nearFact(int number) {
        if (number < 0) {
            return 0;
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        int index = 1, buff = 1;
        while (buff < number) {
            index++;
            buff = factorial(index);
        }
        return (buff - number > number - buff / index - 1) ? buff / index - 1 : buff;
    }

    public static int factorial(int number) {
        if (number < 0) {
            return 0;
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= number; i++)
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
