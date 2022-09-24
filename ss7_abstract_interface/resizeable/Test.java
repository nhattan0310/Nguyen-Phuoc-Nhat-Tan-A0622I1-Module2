package ss7_abstract_interface.resizeable;

public class Test {
    public static void main(String[] args) {
        Shape []shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(4);
        System.out.println(shapes[0].toString());
        shapes[0].resize(7);
        System.out.println(shapes[0].toString());
        System.out.println(shapes[1].toString());
        shapes[1].resize(7);
        System.out.println(shapes[1].toString());
        System.out.println(shapes[2].toString());
        shapes[2].resize(7);
        System.out.println(shapes[2].toString());

    }
}
