package ss2_loop;
public class isprime_less100 {
    public static void main(String[] args) {
        int n = 100;
        int x =2;
        while (x < n){
            if (prime(x)){
                System.out.println(x);
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
