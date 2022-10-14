package ss13_thuat_toan;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So Luong Phan Tu");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
//        public int binarySearch( int[] arr, int left, int right, int value){
//        }
    }
}
