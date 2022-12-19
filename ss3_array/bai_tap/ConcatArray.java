package ss3_array.bai_tap;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,5};
        int[] arrB = {6,7,8,9,10};
        int[] arrNew = new int[arrA.length+arrB.length];
        for (int i = 0; i <arrA.length ; i++) {
            arrNew[i] =arrA[i];
        }
        for (int i = 0; i <arrB.length ; i++) {
            arrNew[arrA.length+i] =arrB[i];
        }
       System.out.println(Arrays.toString(arrNew));
    }
}
