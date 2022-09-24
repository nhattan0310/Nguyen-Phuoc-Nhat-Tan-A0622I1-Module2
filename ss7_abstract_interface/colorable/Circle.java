package ss7_abstract_interface.colorable;

public class Circle extends Shape {
    private double a;
    public Circle() {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                '}';
    }
    public void howToColor() {
        System.out.println("@");
    }
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
