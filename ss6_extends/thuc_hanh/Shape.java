package ss6_extends.thuc_hanh;

public class Shape {
    private  String color = "Green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape" +
                "with color='" + color + '\'' +
                ", filled=" + filled ;
    }

    public static void main(String[] args) {
        Shape s1 =new Shape();
        System.out.println(s1.toString());
    }
}
