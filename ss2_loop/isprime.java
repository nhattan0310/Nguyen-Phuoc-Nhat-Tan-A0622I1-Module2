package ss2_loop;

import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        int n = 20;
        int count =0;
        int x =2;
        while (count <= n){
            if (prime(x)){
                System.out.println(x);
                count++;
            }
            x++;
        }
    }
    public static boolean prime(int n){
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}

