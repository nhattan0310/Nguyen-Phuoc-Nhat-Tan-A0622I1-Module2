package case_study.task2;

public class House extends Facility {
    private int NumberHouse;

    public House() {
    }

    public House(int numberHouse) {
        NumberHouse = numberHouse;
    }

    public House(String villaName, String houseFloor, String room, int numberHouse) {
        super(villaName, houseFloor, room);
        NumberHouse = numberHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "NumberHouse=" + NumberHouse+
                super.toString();
    }
}
