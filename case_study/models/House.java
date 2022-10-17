package case_study.models;

public class House extends Facility {
    private String standarRoom;
    private int houseFloor;

    public House(String serviceName, double area, double costRent, int maxPeople, double rentHour, String standarRoom, int houseFloor) {
        super(serviceName, area, costRent, maxPeople, rentHour);
        this.standarRoom = standarRoom;
        this.houseFloor = houseFloor;
    }

    public String getStandarRoom() {
        return standarRoom;
    }

    public void setStandarRoom(String standarRoom) {
        this.standarRoom = standarRoom;
    }

    public int getHouseFloor() {
        return houseFloor;
    }

    public void setHouseFloor(int houseFloor) {
        this.houseFloor = houseFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standarRoom='" + standarRoom + '\'' +
                ", houseFloor=" + houseFloor +
                super.toString() +
                '}';
    }
}
