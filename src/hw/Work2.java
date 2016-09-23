package hw;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {

        int a, b, c;
        int p = 100;
        double fl = 0.99;
        boolean isOK = true;

        System.out.println("case 1 - cond\ncase 2 - tern\ncase 3 - print5\ncase 4 - numbers\ncase 5 - switching\nanother case - err");
        Scanner scan = new Scanner(System.in);
        c = scan.nextInt();
        System.out.println("a:");
        a = scan.nextInt();
        System.out.println("b:");
        b = scan.nextInt();


        switching(a, b, c, p, fl, isOK);
    }

    public static void switching(int a, int b, int c, int p, double fl, boolean isOK) {
        switch (c) {
            case 1:
                System.out.println("condAnswer:\n" + cond(a, b));
                break;
            case 2:
                System.out.println("ternAnswer:\n" + tern(a, b));
                break;
            case 3:
                System.out.println("Print5:\n");
                print5(p, fl, isOK);
                break;
            case 4:
                System.out.println("Numbers:\n");
                numbers();
                break;
            case 5:
                System.out.printf("Switching:\n");
                switching(a, b, c, p, fl, isOK);
                break;
            default:
                System.out.println("err");

        }
    }

    public static String cond(int a, int b) {

        if ((a - b) < 5) {
            return "<5";
        } else {
            return ">5";
        }
    }

    public static String tern(int a, int b) {

        return (a - b) < 5 ? "<5" : ">5";

    }


    public static void print5(int p, double fl, boolean isOK) {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(Work1.hw1(p, fl, isOK));
        }
    }

    public static void numbers() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

}
