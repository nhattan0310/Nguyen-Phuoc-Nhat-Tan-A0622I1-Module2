package ss3_array;

import java.util.Scanner;


public class DemoArray {
//    public static int searchMax(int arr[]){
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if ( arr[i] >max ){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
    public static int searchMin(int arr[]){
        int min =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] <min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("A["+i +"] ");
            arr[i]= sc.nextInt();
        }
        System.out.print("Value = ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print( arr[i] +" ");
        }
       // System.out.print("\nMax = "+searchMax(arr));
        System.out.print("\nMin = "+searchMin(arr));
        //cach dung for each de in mang
//        for (int element: arrA){
//            System.out.println(element);
//        }
    }
}
