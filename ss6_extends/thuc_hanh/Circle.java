package ss6_extends.thuc_hanh;

public class Circle extends Shape {
    private double radius =1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with" +
                "radius=" + radius +
                "which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Circle circle =new Circle("xanh",true,3);
        System.out.println(circle.toString());
    }
}
