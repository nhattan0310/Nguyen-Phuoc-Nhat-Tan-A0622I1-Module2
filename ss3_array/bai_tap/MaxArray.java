package ss3_array.bai_tap;

public class MaxArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 12, 3},
                {4, 9, 6},
                {7, 8, 0}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max =" +max);
    }
}
