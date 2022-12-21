package ss15_exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
public static void checkTriangleEdges(double a,double b,double c)throws IllegalTriangleException2{
    if(a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0){
        throw new IllegalTriangleException2("Nhap Gia Tri Sai");
    }
    else{
        throw new IllegalTriangleException2("Hoan Thanh");
    }
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Enter a = ");
            a = sc.nextDouble();
            System.out.print("Enter b = ");
            b = sc.nextDouble();
            System.out.print("Enter c = ");
            c = sc.nextDouble();
            try {
                checkTriangleEdges(a, b, c);
            } catch (IllegalTriangleException2 exception) {
                System.out.println(exception.getMessage());
            }

        } catch (Exception exception) {
            System.out.print("Lỗi: Không đúng định dạng");
        }
    }
}
