package ss4_oop.fan;

public class Fan {
    //khai bao kieu du lieu
    private final int SLOW =1;
    private final int MEDIUM =2;
    private final int FAST =3;
    private int speed =SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color= "blue";
    //khoi tao tham so
    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "SLOW=" + SLOW +
                ", MEDIUM=" + MEDIUM +
                ", FAST=" + FAST +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setColor("Blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
