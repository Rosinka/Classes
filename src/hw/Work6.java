package hw;

/**
 * Created by lana on 31.01.17.
 */
public class Work6 {
    public static void main(String[] args) {

        System.out.println(fibRecMethod(1));
        System.out.println(fibSumMethod(1));
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
