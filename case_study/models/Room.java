package case_study.models;

public class Room extends Facility {
    private String serviceFree;

    public Room(String serviceName,
                double area,
                double costRent,
                int maxPeople,
                double rentHour,
                String serviceFree) {
        super(serviceName, area, costRent, maxPeople, rentHour);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                super.toString() +
                '}';
    }
}
