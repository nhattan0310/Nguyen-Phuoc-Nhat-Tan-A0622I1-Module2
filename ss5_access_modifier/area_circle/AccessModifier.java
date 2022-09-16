package ss5_access_modifier.area_circle;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";


    public AccessModifier() {
    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

   public double getArea() {
        return 3.14*radius*radius;
   }
}
