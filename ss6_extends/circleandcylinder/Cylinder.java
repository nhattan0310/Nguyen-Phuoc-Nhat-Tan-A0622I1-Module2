package ss6_extends.circleandcylinder;

public class Cylinder extends Circle {
    //khai bao
    private double height = 2.0;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    //khoi tao phuong thuc
    public double getVolume() {
        return getArea() * this.height;
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
//        Cylinder hinhtron2 = new Cylinder();
//        System.out.println(hinhtron.hashCode());
//        System.out.println(hinhtron2.hashCode());
        double area = circle.getArea();
        System.out.println(area);

        Cylinder hinhtru = new Cylinder();
        hinhtru.setColor("Red");
        hinhtru.setRadius(4);
        String volume = hinhtru.toString();
        System.out.println("Volume = " + volume);
    }
}