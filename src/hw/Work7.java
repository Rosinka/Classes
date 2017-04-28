package hw;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by lana on 01.02.17.
 */
public class Work7 {
    public static void main(String[] args) {

        int [] arr = Work3.arrayRand();
        System.out.println(arrPart(arr, 2, 5));

    }

    public static int[] arrPart(int[] arr, int srcPos, int destPos) {
        int [] arrPart = new int[destPos - srcPos];
        System.arraycopy(arr, srcPos, arrPart, destPos, arr.length);
        System.out.println(Arrays.toString(arr));
        return arrPart;
    }

}
