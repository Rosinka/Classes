package hw;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {

        int a = 1;
        boolean b = true;
        boolean c = false;
        byte d = 32;
        int e = 128;
        byte f = 47;
        int p = 100;
        double fl = 0.99;
        boolean isOK = true;

        oper(a, b, c, d, e, f);
        System.out.println(print("myString"));
        hw1(p, fl, isOK);

    }

    public static void oper(int a, boolean b, boolean c, byte d, int e, byte f) {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("less 3 |  =3  | more 3\n  arif | bool | bit");
        if (scan.hasNextInt()) {
            i = scan.nextInt();
            if (i < 3) {
                a++;
                double ans1 = (100 / 25 + 350 * 2) / (600 - 250 * 2) + 10.5 % 2 * a;
                System.out.println("Example: (100/25 + 350*2)/(600 - 250*2) + 10.5%2 * a\nAnswer: " + ans1);
            } else if (i == 3) {
                boolean ans2 = (b & c) ^ c || (!c | b);
                System.out.println("Example: (b&c)^c||(!c|b)\nAnswer: " + ans2 + "\nПорядок убывания приоритета ! & ^ | && ||");
            } else if (i > 3) {
                int ans3 = (d << 2) ^ (e | f);
                System.out.println("Example: (d<<2)^(e|f)\nAnswer: " + ans3);
            }
        } else {
            System.out.println("err");
        }
    }

    public static String print(String str) {
        return str;
    }

    public static String hw1(int p, double fl, boolean isOK) {

        return "Hello, U-Rise!\n" + "There is true, that there are " + p + " percent sucess with " + fl + " happiness." + isOK;

    }

}

