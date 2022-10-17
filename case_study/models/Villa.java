package case_study.models;

public class Villa extends Facility {
    private String standarVilla;
    private double poolArea;
    private int floor;

    public Villa(String serviceName, double area, double costRent, int maxPeople, double rentHour, String standarVilla, double poolArea, int floor) {
        super(serviceName, area, costRent, maxPeople, rentHour);
        this.standarVilla = standarVilla;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String serviceName, double area, double costRent, int maxPeople, double rentHour) {
        super(serviceName, area, costRent, maxPeople, rentHour);
    }

    public String getStandarVilla() {
        return standarVilla;
    }

    public void setStandarVilla(String standarVilla) {
        this.standarVilla = standarVilla;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standarRoom='" + standarVilla + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                super.toString() +
                '}';
    }
}
