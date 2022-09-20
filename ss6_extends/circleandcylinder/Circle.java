package ss6_extends.circleandcylinder;

public class Circle extends Object {
    //Khai Bao
    private double radius =1.0;
    private String color ="red";
    //ham Khoi tao tham so

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //khoi tao phuong thuc
    public double getArea() {
        return 3.14 * this.radius * this.radius ;
    }

    @Override
    public String toString() {
        return radius + " " +color ;
    }
}
