package case_study.task2.t1;

public class Facility {
    private String serviceName;
    private double area;
    private double costRent;
    private int maxPeople;
    private double rentHour;

    public Facility(String serviceName, double area, double costRent, int maxPeople, double rentHour) {
        this.serviceName = serviceName;
        this.area = area;
        this.costRent = costRent;
        this.maxPeople = maxPeople;
        this.rentHour = rentHour;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public double getRentHour() {
        return rentHour;
    }

    public void setRentHour(double rentHour) {
        this.rentHour = rentHour;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", costRent=" + costRent +
                ", maxPeople=" + maxPeople +
                ", rentHour=" + rentHour +
                '}';
    }
}
