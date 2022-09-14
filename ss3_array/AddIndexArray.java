package ss3_array;

import java.util.Scanner;

public class AddIndexArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Before Add");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap Gia Tri Muon Chen");
        int n =sc.nextInt();
        System.out.println("Nhap Vi Tri Muon Chen");
        int m =sc.nextInt();
        System.out.println("After Add");
        System.out.println(themPhanTu(arr,m));
    }
    public static int[] themPhanTu(int[] arr, int m) {
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < m; i++) {
            arrNew[i] = arr[i];
        }
        for (int i = m; i < arr.length; i++) {
            arrNew[i + 1] = arr[i];
        }
        return arrNew;
    }

}
