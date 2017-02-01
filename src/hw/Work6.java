package hw;

/**
 * Created by lana on 31.01.17.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;

public class Work6 {
    public static void main(String[] args) {

        System.out.println(fibRecMethod(1));
        System.out.println(fibSumMethod(1));
        System.out.println(factorial(4));
        System.out.println(Arrays.toString(factArr(10)));
        int[] newFactArr = factArr(10);
        System.out.println(nearestFact(5, newFactArr));
        System.out.println(isNumeric("123456"));
        System.out.println(getNumeric("12354"));
        ArrayList<Integer> newNum = getNumeric("1234567");
        System.out.println(numFromArrList(newNum));
    }

    public static int numFromArrList(ArrayList<Integer> num) {
        StringBuilder strNum = new StringBuilder();
        for (int n : num) {
            strNum.append(n);
        }
        int finalInt = Integer.parseInt(strNum.toString());
        return finalInt;
    }

    public static ArrayList<Integer> getNumeric(String str) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        if (isNumeric(str) == true) {
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

    public static int nearestFact(int n, int... args) {
        int temp = Math.abs(args[0] - n);
        int diffIndex = 0;
        for (int i = 1; i < args.length; i++) {
            int diff = Math.abs(args[i] - n);
            if (diff < temp) {
                diffIndex = i;
                temp = diff;
            }
        }
        return args[diffIndex];
    }

    public static int[] factArr(int n) {
        int[] factArr = new int[n];
        for (int i = 0; i < n; i++) {
            factArr[i] = factorial(i);
        }
        return factArr;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        do {
            int fact = 1;
            for (int i = 2; i <= n; i++)
                fact *= i;
            return fact;
        } while (n < 0);
    }

    public static int fibSumMethod(int pos) {
        if (pos == 1 || pos == 2) {
            return 1;
        }
        int pos1 = 1;
        int pos2 = 1;
        int i = 2;
        int fibSum = 0;
        while (i < pos) {
            fibSum = pos1 + pos2;
            pos1 = pos2;
            pos2 = fibSum;
            i++;
        }
        return fibSum;
    }

    public static int fibRecMethod(int pos) {
        if (pos == 1 || pos == 2) {
            return 1;
        }
        return fibRecMethod(pos - 1) + fibRecMethod(pos - 2);
    }

}
