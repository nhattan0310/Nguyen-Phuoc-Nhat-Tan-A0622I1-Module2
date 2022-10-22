package case_study.services;

import case_study.models.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
     for (Employee employee :employeeList){
         System.out.println(employee.toString());
     }
    }

    @Override
    public void add() {
        System.out.println("Enter Your Name");
        String name =sc.nextLine();
        System.out.println("Enter Your Birthday");
        int birthday =Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your Gender");
        String gender =sc.nextLine();
        System.out.println("Enter Your IdentityCard");
        int identityCard =Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your PhoneNumber");
        int phoneNumber =Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your Gmail");
        String gmail =sc.nextLine();
        System.out.println("Enter Your Employee ID");
        int employeeID =Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your Level");
        String level =sc.nextLine();
        System.out.println("Enter Your Position");
        String position =sc.nextLine();
        System.out.println("Enter Your Salary");
        int salary =Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(name,birthday,gender,identityCard,phoneNumber,gmail,employeeID,level,position,salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("What Do U Want To Edit ID");
        int idEdit = sc.nextInt();
        for (Employee employee:employeeList){
            if (idEdit == employee.getEmployeeID()){
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
