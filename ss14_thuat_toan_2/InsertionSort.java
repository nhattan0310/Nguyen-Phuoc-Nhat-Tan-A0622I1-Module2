package ss14_thuat_toan_2;

import java.util.Scanner;

public class
InsertionSort {
    public static void main(String[] args) {
        int array[]={2,3,4,5,8,9};
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
}
