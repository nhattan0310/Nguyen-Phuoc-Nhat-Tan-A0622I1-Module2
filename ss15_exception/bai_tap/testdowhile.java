package ss15_exception.bai_tap;

import java.util.Scanner;

public class testdowhile {
    public static void checkTriangleEdges(double a, double b, double c) throws IllegalTriangleException2 {
        if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException2("Nhap Gia Tri Sai");
        }
//        else {
//            throw new IllegalTriangleException2("Hoan Thanh");
//        }
    }

    public static void main(String[] args) {
        System.out.println("Bắt đầu");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            flag =false;
            double a, b, c ;
        try {
            System.out.print("Enter a = ");
            String s = sc.nextLine();
            System.out.print("Enter b =");
            String m = sc.nextLine();
            System.out.print("Enter c =");
            String l = sc.nextLine();
            try{
               a=  Double.parseDouble(s);
               b=  Double.parseDouble(m);
               c=  Double.parseDouble(l);
            }
            catch (Exception e){
                e.printStackTrace();
                Thread.sleep(1000);
                System.out.print("Enter a again = ");
                a =  Double.parseDouble(sc.nextLine());
                System.out.print("Enter b again = ");
                b =  Double.parseDouble(sc.nextLine());
                System.out.print("Enter c again = ");
                c =  Double.parseDouble(sc.nextLine());
            }
            checkTriangleEdges(a,b,c);
            } catch (IllegalTriangleException2 exception) {
                System.out.println(exception.getMessage());
            System.out.println("Nhap lai");
            flag =true;
            }
        catch (NumberFormatException | InterruptedException e){
            flag =true;
            e.printStackTrace();
            System.out.println("Dang Nhap Chu");
        }
        } while (flag);
        System.out.println("Ket Thuc");
    }
}

