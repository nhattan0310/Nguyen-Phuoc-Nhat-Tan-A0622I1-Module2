package ss2_loop;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So Luong SNT Muon In Ra");
        int input = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count <= input) {
            for (int i = 2; i < input * input; i++) {
                if (n % i ==0){
                    System.out.println(i);
                }
                count++;
            }
        }
    }
}
