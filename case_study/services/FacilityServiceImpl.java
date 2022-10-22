package case_study.services;

import case_study.models.Facility;
import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    List<Facility> facilityList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Facility facility :facilityList){
            System.out.println(facility.toString());
        }
    }

//    String serviceName,
//    double area,
//    double costRent,
//    int maxPeople,
//    double rentHour

    @Override
    public void add() {
        System.out.println("Enter Your ServiceName");
        String serviceName = sc.nextLine();
        System.out.println("Enter Your Area");
        double area = sc.nextDouble();
        System.out.println("Enter Your CostRent");
        double costRent = sc.nextDouble();
        System.out.println("Enter Your MaxPeople");
        int maxPeople = sc.nextInt();
        System.out.println("Enter Your RentHour");
        double rentHour = sc.nextDouble();

        Facility facility = new Facility(serviceName,area,costRent,maxPeople,rentHour);
        facilityList.add(facility);



    }

    @Override
    public void edit() {
        System.out.println("What Do U Want To Edit Service");
        String serviceEdit = sc.nextLine();
        for (Facility facility: facilityList){
            if (serviceEdit.equals(facility.getServiceName())){
                add();
                return;
            }
        }
        System.out.println("Not Found");
    }

    @Override
    public void remove() {

    }
}
