package ss7_abstract_interface.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3);
        circles[1] = new Circle(4);
        circles[2] = new Circle(23.4, "green", true);
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }

}
