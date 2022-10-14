package ss6_extends.thuc_hanh;

public class Rectangle extends Shape {
    private double width =1.0;
    private double height =1.0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle( double width, double height,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {

    }

    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width*this.height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "width= " + width +
                ", height= " + height +
                super.toString();
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.getArea());
        Rectangle r1 =new Rectangle(3,4,"cam",true);
        System.out.println(r1.getPerimeter());
    }
}
