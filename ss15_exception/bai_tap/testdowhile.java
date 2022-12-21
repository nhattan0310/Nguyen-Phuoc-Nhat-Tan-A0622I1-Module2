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
//            System.out.println("Enter a");
//            System.out.println("Enter b");
//            System.out.println("Enter c");
            double a, b, c ;
        try {
            System.out.print("Enter a = ");
            String t = sc.nextLine();
            System.out.print("Enter b =");
            String l = sc.nextLine();
            System.out.print("Enter c =");
            String m = sc.nextLine();
            try{
               a=  Double.parseDouble(t);
               b=  Double.parseDouble(l);
               c=  Double.parseDouble(m);
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

//            System.out.print("Enter b = ");
//            b = sc.nextDouble();
//            System.out.print("Enter c = ");
//            c = sc.nextDouble();
            checkTriangleEdges(a,b,c);
            } catch (IllegalTriangleException2 exception) {
                System.out.println(exception.getMessage());
            System.out.println("Nhap lai");
            flag =true;
            }catch (NumberFormatException | InterruptedException e){
            flag =true;
            e.printStackTrace();
            System.out.println("Dang Nhap Chu");
        }
        } while (flag);
        System.out.println("Ket Thuc");
    }
}

