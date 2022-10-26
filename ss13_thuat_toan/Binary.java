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
    }
        public static int findBinary(int [] arr,int phantu){
            int index = -1;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]  == phantu){
                     index = i;
                }
            }
            return index;
        }
//        public int binarySearch( int[] arr, int left, int right, int value){
//        }

}
