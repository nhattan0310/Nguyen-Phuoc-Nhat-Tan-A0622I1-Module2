package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        System.out.println("Enter Number You Want");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0; i <1;i++ ) {
            if (n==1){
                System.out.println("1 Display list employees\n" +
                        "2 Add new employee\n" +
                        "3 Edit employee\n" +
                        "4 Return main menu");
            }
            else if(n==2){
                System.out.println("1. Display list customers\n" +
                        "2. Add new customer\n" +
                        "3. Edit customer\n" +
                        "4. Return main menu");
            }
            else if(n==3){
                System.out.println("1 Display list facility\n" +
                        "2 Add new facility\n" +
                        "3 Display list facility maintenance\n" +
                        "4 Return main menu");
            }
            else if (n==4){
                System.out.println("1. Add new booking\n" +
                        "2. Display list booking\n" +
                        "3. Create new constracts\n" +
                        "4. Display list contracts\n" +
                        "5. Edit contracts\n" +
                        "6. Return main menu");
            }
            else if (n==5){
                System.out.println("1. Display list customers use service\n" +
                        "2. Display list customers get voucher\n" +
                        "3. Return main menu");
            }
            else if(n==6){
                break;
            }
            else {
                System.out.println("The Value Error.GoodBye");
            }
        }
    }
}
