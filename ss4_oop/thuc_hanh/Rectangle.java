package ss4_oop.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    private double width,height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height*this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Weight");
        double weight = sc.nextDouble();
        System.out.println("Enter Height");

        double height = sc.nextDouble();
        System.out.println();
        Rectangle rectangle = new Rectangle(weight,height);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
