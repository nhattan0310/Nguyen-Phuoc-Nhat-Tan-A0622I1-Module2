package ss7_abstract_interface.colorable;

public class Square extends Shape {
    private double a;

    public Square() {
    }

    public Square(double a) {
        this.a = a;
    }

    public Square(String color, boolean filled, double a) {
        super(color, filled);
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
        return "Square{" +
                "a=" + a +
                '}';
    }
    public String getName(){
        return this.getClass().getSimpleName();
    }
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}