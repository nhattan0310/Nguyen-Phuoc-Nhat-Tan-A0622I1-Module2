package ss15_exception.thuc_hanh;

import java.util.Scanner;

    public class ArrayExample {
    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
    public Integer[] createRandom() {
        ArrayExample rd = new ArrayExample();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = scaner.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
