package ss3_array.bai_tap;

import java.util.Scanner;

public class del_index_array {

    public static int findIndex(int[] arr, int phantu) {
        int viTri = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == phantu) {
                viTri = i;
            }
        }
        return viTri;
    }

    public static int[] delElement(int[] arr, int viTri) {
        int[] arrNew = new int[arr.length - 1];
        for (int i = 0; i < viTri; i++) {
            arrNew[i] = arr[i];
        }
        for (int i = viTri + 1; i < arr.length; i++) {
            arrNew[i - 1] = arr[i];
        }
        return arrNew;
    }

    public static void main(String[] args) {
        int arr[] = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
//        String delimeter = arr[] == ? "":",";
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1] + ".");
        Scanner sc = new Scanner(System.in);
        int soCanXoa = sc.nextInt();
        int viTriCanXoa = findIndex(arr, soCanXoa);
        System.out.println(viTriCanXoa);
        if (viTriCanXoa == -1) {
            System.out.println("Phan Tu Khong Co Trong Mang");
        } else {
            arr = delElement(arr, viTriCanXoa);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}