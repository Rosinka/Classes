package hw;

import static java.lang.Math.sqrt;

public class Work4 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        int line1 = scan.nextInt();
//        int line2 = scan.nextInt();
//        int line3 = scan.nextInt();
//
//        System.out.println(isRectangularTriangle(line1, line2, line3));
//
//        int line4 = scan.nextInt();
//        int line5 = scan.nextInt();
//        int line6 = scan.nextInt();
//
//        System.out.println(checkIsoscelesTriangle(line4, line5, line6));
//
//        int line7 = scan.nextInt();
//        int line8 = scan.nextInt();
//        int line9 = scan.nextInt();
//        int line10 = scan.nextInt();
//        int line11 = scan.nextInt();
//        int line12 = scan.nextInt();
//
//        System.out.println(checkEquitableTriangle(line7, line8, line9, line10, line11, line12));
//
//        int number1 = scan.nextInt();
//
//        System.out.println(isEvenSumNumber(number1));
//
//        int number2 = scan.nextInt();
//
//        System.out.println(isPalindromeNumber(number2));
//
//        int number3 = scan.nextInt();
//
//        System.out.println(isEqualHalfSum(number3));
//
//        int number4 = scan.nextInt();

        System.out.println(isDescendNumber(5432));
    }

    public static boolean checkTriangle(double a, double b, double c) {
        if ((a + b > c) & (a + c > b) & (b + c > a)) {
            return true;
        }
        return false;
    }

    public static boolean isRectangularTriangle(double line1, double line2, double line3) {
        if (checkTriangle(line1, line2, line3) == true) {
            if (line1 == sqrt(Math.pow(line2, 2) + Math.pow(line3, 2)) | line2 == sqrt(Math.pow(line1, 2) + Math.pow(line3, 2)) | line3 == sqrt(Math.pow(line2, 2) + Math.pow(line1, 2))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean checkIsoscelesTriangle(double line4, double line5, double line6) {
        if (checkTriangle(line4, line5, line6) == true) {
            if (line4 == line5 | line4 == line6 | line5 == line6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isoscelesTriangle(int a, int b, int c) {
        return a == b && a == c && c == b;
    }

    public static boolean checkEquitableTriangle(int line7, int line8, int line9, int line10, int line11, int line12) {
        if (checkTriangle(line7, line8, line9) == true & checkTriangle(line10, line11, line12) == true) {
            if (isoscelesTriangle(line7, line8, line9) && isoscelesTriangle(line10, line11, line12)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int[] digits(int number) {
        int length = len(number);
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[length - 1 - i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int len(int number) {
        int res = 0;
        while (number / 10 != 0 || number % 10 != 0) {
            number /= 10;
            res++;
        }
        return res;
    }

    public static boolean isEvenSumNumber(int number) {
        int sum = 0;
        if (len(number) != 4) {
            return false;
        }

        int[] digits = digits(number);
        for (int i = 0; i < len(number); i++) {
            sum += digits[i];
        }
        return sum % 2 == 0;
    }

    // TODO: check
    public static boolean isPalindromeNumber(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static boolean isEqualHalfSum(int number) {
        if (len(number) != 4) {
            return false;
        }
        int[] digits = digits(number);
        int first = 0, second = 0;
        for (int i = 0; i < digits.length / 2; i++) {
            first += digits[i];
            second += digits[digits.length - 1 - i];
        }
        return first == second;
    }

    public static boolean isDescendNumber(int number) {
        if (len(number) != 4) {
            return false;
        }
        int[] digits = digits(number);
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] < digits[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
