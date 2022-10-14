package ss4_oop.phuong_trinh_bac2;

public class QuadraticEquation {
    //Khai Bao Thuộc Tính
    private double a;
    private double b;
    private double c;
    // khoi tao tham so
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //Khoi tao Phuong Thuc
    public double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public double getRoot1(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getRoot2(double a, double b, double c) {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getRoot3(double a, double b, double c) {
        return -b / 2 * a;
    }

}
