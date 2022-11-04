package case_study.controller;

import case_study.services.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.println("Enter Number You Want");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotion();
                    break;
                case 6:
                   break;
                default:
                    System.out.println("Bye Bye");

            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Return main menu");
            System.out.println("Enter Number You Want");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                default:
                    displayMainMenu();


        }
    }
    }
    public static void displayCustomerMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.println("Enter Number You Want");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
            }
        }
    }
    public static void displayFacilityMenu(){
        FacilityService facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1 Display list facility\n" +
                    "2 Add new facility\n" +
                    "3 Display list facility maintenance\n" +
                    "4 Return main menu");
            System.out.println("Enter Number You Want");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    facilityService.addNewFacilityMenu();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                default:
                    displayMainMenu();

            }
        }
    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new constracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            System.out.println("Enter Number You Want");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        }
    }
        public static void displayPromotion(){
            boolean check = true;
            while (check) {
                System.out.println("1. Display list customers use service\n" +
                        "2. Display list customers get voucher\n" +
                        "3. Return main menu");
                System.out.println("Enter Number You Want");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
            }
        }
}
