package case_study.task2;

public class Room extends Facility {
    private int RoomNumber;

    public Room() {
    }

    public Room(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public Room(String villaName, String houseFloor, String room, int roomNumber) {
        super(villaName, houseFloor, room);
        RoomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomNumber=" + RoomNumber+
                super.toString();
    }
}
