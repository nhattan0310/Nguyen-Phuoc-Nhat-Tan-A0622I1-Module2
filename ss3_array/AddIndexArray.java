package ss3_array;

import java.util.Scanner;

public class AddIndexArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Before Add");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Vi Tri Muon Chen");
        int n = sc.nextInt();
        System.out.println("Nhap Gia Tri Muon Chen");
        int m = sc.nextInt();
        System.out.println("After Add");
        arr = insertArray(arr, m, n);
        for (int arr2 : arr) {
            System.out.print(arr2 + " ");
        }
    }
    public static int[] insertArray(int[] arr, int k, int m) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i < m) {
                result[i] = arr[i];
            } else if (i == m) {
                result[i] = k;
            } else {
                result[i] = arr[i - 1];
            }
        }
        return result;
        // lỗi tâm linh
    }
}