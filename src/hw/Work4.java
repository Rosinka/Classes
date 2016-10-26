package hw;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Work4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int line1 = scan.nextInt();
        int line2 = scan.nextInt();
        int line3 = scan.nextInt();

        System.out.println(exercise1(line1, line2, line3));

        int line4 = scan.nextInt();
        int line5 = scan.nextInt();
        int line6 = scan.nextInt();

        System.out.println(exercise2(line4, line5, line6));

        int line7 = scan.nextInt();
        int line8 = scan.nextInt();
        int line9 = scan.nextInt();
        int line10 = scan.nextInt();
        int line11 = scan.nextInt();
        int line12 = scan.nextInt();

        System.out.println(exercise3(line7, line8, line9, line10, line11, line12));

        int number1 = scan.nextInt();

        System.out.println(exercise4(number1));

        int number2 = scan.nextInt();

        System.out.println(exercise5(number2));

        int number3 = scan.nextInt();

        System.out.println(exercise6(number3));

        int number4 = scan.nextInt();

        System.out.println(exercise7(number4));
    }

    public static boolean checkTriangle(double a, double b, double c) {
        if ((a + b > c) & (a + c > b) & (b + c > a)) {
            return true;
        }
        return false;
    }

    public static boolean exercise1(double line1, double line2, double line3) {
        if (checkTriangle(line1, line2, line3) == true) {
            if (line1 == sqrt(Math.pow(line2, 2) + Math.pow(line3, 2)) | line2 == sqrt(Math.pow(line1, 2) + Math.pow(line3, 2)) | line3 == sqrt(Math.pow(line2, 2) + Math.pow(line1, 2))) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public static boolean exercise2(double line4, double line5, double line6) {
        if (checkTriangle(line4, line5, line6) == true) {
            if (line4 == line5 | line4 == line6 | line5 == line6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean exercise3(int line7, int line8, int line9, int line10, int line11, int line12) {
        if (checkTriangle(line7, line8, line9) == true & checkTriangle(line10, line11, line12) == true) {
            if ((line7 == line8 & line7 == line9 & line9 == line8) & (line10 == line11 & line10 == line12 & line11 == line12)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean exercise4(int number1) {
        int sum = 0;
        while (number1 > 0){
            sum += number1 % 10;
            number1 /= 10;
        }

        if (sum % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean exercise5(int number2) {
        int palindrome = number2;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number2 == reverse) {
            return true;
        }
        return false;
    }

    public static boolean exercise6(int number3) {
        if (number3 % 10 + (number3 / 10) % 10 == (number3 / 100) % 10 + (number3 / 1000) % 10) {
            return true;
        }
        return false;
    }

    public static boolean exercise7(int number4) {
        if ((number4 % 10) > (number4 / 10) % 10 & (number4 / 100) % 10 > (number4 / 1000) % 10) {
            return true;
        }
        return false;
    }
}
