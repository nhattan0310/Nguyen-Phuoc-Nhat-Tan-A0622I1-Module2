package ss7_abstract_interface.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(3);
        shapes[1] = new Circle(2);
        for (int i = 0; i <shapes.length ; i++) {
            if (shapes[i].getName().equals("Square")){
                shapes[i].howToColor();
            }
        }
        System.out.println(shapes[0].toString());
    }
}
