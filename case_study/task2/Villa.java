package case_study.task2;

public class Villa extends Facility {
    private String VillaColor;

    public Villa(String villaColor) {
        VillaColor = villaColor;
    }

    public Villa(String villaName, String houseFloor, String room, String villaColor) {
        super(villaName, houseFloor, room);
        VillaColor = villaColor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "VillaColor='" + VillaColor + '\'' +
                super.toString();
    }
}
