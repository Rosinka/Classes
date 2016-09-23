package hw;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {

        int a = 0, b = 0, c;

        int p = 100;
        double fl = 0.99;
        boolean isOK = true;

        System.out.println("case 1 - cond\ncase 2 - tern\nanother case - err");
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.println("condAnswer:\n" + cond(a, b));
                break;
            case 2:
                System.out.println("ternAnswer:\n" + tern(a, b));
                break;
            default:
                System.out.println("err");

                print5(p, fl, isOK);

        }
    }

    public static String cond(int a, int b) {

        System.out.println("a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("b:");
        b = sc.nextInt();

        if ((a - b) < 5) {
            return "<5";
        } else {
            return ">5";
        }
    }

    public static String tern(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        a = sc.nextInt();
        System.out.println("b:");
        b = sc.nextInt();
        return (a - b) < 5 ? "<5" : ">5";
    }

    public static String hw1(int p, double fl, boolean isOK) {

        return "Hello, U-Rise!\n" + "There is true, that there are " + p + " percent sucess with " + fl + " happiness." + isOK;

    }

    public static String print5(int p, double fl, boolean isOK) {
        int i;
        String str = null;

        for (i = 0; i < 5; i++) {
            str = hw1(p, fl, isOK);
        }

        return str;
    }

}
