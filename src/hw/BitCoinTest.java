package hw;

import java.util.Scanner;

public class BitCoinTest {

    public static void main(String[] args) {

        System.out.println("Menu:\n Option 1: Call method 1\n Option 2: Call method 2\n Option 3: Call method 3\n Option 4: Exit\n");
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (i > 0) {
            System.out.println("Please enter your choice: ");
            String option = scan.nextLine();
            switchMenu(returnOption(option));
        }

    }

    public static void switchMenu(int digit) {
        switch (digit) {
            case 1:
                method(1);
                break;
            case 2:
                method(2);
                break;
            case 3:
                method(3);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public static int returnOption(String str) {
        int number = getNumeric(str);
        if (number != -1 && number != 0) {
            return number;
        }
        return 0;
    }

    private static int getNumeric(String str) {
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

    private static boolean isNumeric(String str) {
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

    private static void method(int i) {
        if (i == 1) System.out.println("Run method 1");
        if (i == 2) System.out.println("Run method 2");
        if (i == 3) System.out.println("Run method 3");
    }


}
