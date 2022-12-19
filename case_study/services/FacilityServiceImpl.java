package case_study.services;

import case_study.controller.FuramaController;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.untils.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService{
    public static final String REGEX_STR ="[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA="(SVVL)[-][\\d]{4}";
    public static final String REGEX_AMOUNT="^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT="[1-9]|([1][0-9])$";
    public static final String REGEX_AREA="^([3-9]\\d[1-9]\\d{2,})$";
//    //task5
    private static Scanner sc = new Scanner(System.in);
    private static Map<Facility,Integer> facilityIntegerMap=new LinkedHashMap<>();
    @Override
    public void display() {
        Set<Facility> keys =facilityIntegerMap.keySet();
        for (Facility facility:keys){
            System.out.println(facility.toString());
        }
    }

    public  void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Back to menu\n" +
                    "Enter Number U Want");
            Scanner sc =new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewRoom();
                    break;
                case 3:
                    facilityService.addNewHouse();
                    break;
                case 4:
                    FuramaController.displayMainMenu();

            }
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter ServiceName");
        String serviceName =sc.nextLine();
        System.out.println("Enter Area");
        Double area =Double.parseDouble(sc.nextLine());
        System.out.println("Enter CostRent");
        Double costRent=Double.parseDouble(sc.nextLine());
        System.out.println("Enter MaxPeople");
        int maxPeople=Integer.parseInt(sc.nextLine());
        System.out.println("Enter RentHour");
        Double rentHour =Double.parseDouble(sc.nextLine());
        System.out.println("Enter StandarVilla");
        String standarVilla =sc.nextLine();
        System.out.println("Enter PoolArea");
        Double poolArea=Double.parseDouble(sc.nextLine());
        System.out.println("Enter Floor");
        int floor=Integer.parseInt(sc.nextLine());
        Villa villa =new Villa(serviceName,area,costRent,maxPeople,rentHour,standarVilla,poolArea,floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Add New Villa Success");
    }
//    private String inputId(){
//        System.out.println("Enter ID,");
////        return RegexData.regexStr();
//    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter ServiceName");
        String serviceName =sc.nextLine();
        System.out.println("Enter Area");
        Double area =Double.parseDouble(sc.nextLine());
        System.out.println("Enter CostRent");
        Double costRent=Double.parseDouble(sc.nextLine());
        System.out.println("Enter MaxPeople");
        int maxPeople=Integer.parseInt(sc.nextLine());
        System.out.println("Enter RentHour");
        Double rentHour =Double.parseDouble(sc.nextLine());
        System.out.println("Enter Standar Room");
        String standarRoom =sc.nextLine();
        System.out.println("Enter House Floor");
        int houseFloor=Integer.parseInt(sc.nextLine());
        House house = new House(serviceName,area,costRent,maxPeople,rentHour,standarRoom,houseFloor);
        facilityIntegerMap.put(house,0);
        System.out.println("Add New House Success");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter ServiceName");
        String serviceName =sc.nextLine();
        System.out.println("Enter Area");
        Double area =Double.parseDouble(sc.nextLine());
        System.out.println("Enter CostRent");
        Double costRent=Double.parseDouble(sc.nextLine());
        System.out.println("Enter MaxPeople");
        int maxPeople=Integer.parseInt(sc.nextLine());
        System.out.println("Enter RentHour");
        Double rentHour =Double.parseDouble(sc.nextLine());
        String serviceFree=sc.nextLine();
        Room room = new Room(serviceName,area,costRent,maxPeople,rentHour,serviceFree);
        facilityIntegerMap.put(room,0);
        System.out.println("Add New Room Success");
    }

    @Override
    public void displayMaintain() {

    }

}
