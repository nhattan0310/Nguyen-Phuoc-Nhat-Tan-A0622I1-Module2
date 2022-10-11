package case_study.task2;

public class Facility {
    private String VillaName;
    private String HouseFloor;
    private String Room;

    public Facility() {
    }

    public Facility(String villaName, String houseFloor,
                    String room) {
        VillaName = villaName;
        HouseFloor = houseFloor;
        Room = room;
    }

    public String getVillaName() {
        return VillaName;
    }

    public void setVillaName(String villaName) {
        VillaName = villaName;
    }

    public String getHouseFloor() {
        return HouseFloor;
    }

    public void setHouseFloor(String houseFloor) {
        HouseFloor = houseFloor;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "VillaName='" + VillaName + '\'' +
                ", HouseFloor='" + HouseFloor + '\'' +
                ", Room='" + Room + '\'' +
                '}';
    }
}
