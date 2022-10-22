package case_study.services;

import case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    List<Customer> customerList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
    for (Customer customer:customerList) {
        System.out.println(customer.toString());
    }


    }

    @Override
    public void add() {
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Birthday");
        int birthday = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your Gender");
        String gender = sc.nextLine();
        System.out.println("Enter Your IdentityCard");
        int identityCard = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your PhoneNumber");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your Gmail");
        String gmail = sc.nextLine();
        System.out.println("Enter Your CustomerCode");
        String customerCode = sc.nextLine();
        System.out.println("Enter Your TypeCustomer");
        String typeCustomer = sc.nextLine();
        System.out.println("Enter Your Address");
        String address = sc.nextLine();
        Customer customer =new Customer(name,birthday,gender,identityCard,phoneNumber,gmail,customerCode,typeCustomer,address);
        customerList.add(customer);


    }

    @Override
    public void edit() {
        System.out.println("What Do U Want To Edit Code");
        String codeEdit =sc.nextLine();
        for (Customer customer :customerList) {
            if (codeEdit.equals(customer.getCustomerCode())) {
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
