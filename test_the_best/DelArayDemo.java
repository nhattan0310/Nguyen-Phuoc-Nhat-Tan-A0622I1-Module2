package test_the_best;

import java.util.Scanner;

public class DelArayDemo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        System.out.println("Before Dell");
        outputArr(arr);
        System.out.println("\n Enter Random Number");
        Scanner sc = new Scanner(System.in);
        int dellElement = sc.nextInt();
        System.out.println("After Dell");
        outputArr( dellElement(dellElement,arr));
    }

    public static void outputArr(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int[] dellElement(int dellElement, int[] arr) {
        int[] arr2 = new int[arr.length - 1];
        loop1:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != dellElement) {
                arr2[i] = arr[i];
            } else {
                for (int j = i; j < arr2.length; j++) {
                    arr2[i] = arr[i + 1];
                }break loop1;
            }
        }
        return arr2;
    }

}
