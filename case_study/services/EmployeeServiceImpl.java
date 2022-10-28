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
        int autoSTT = 1;
        for (Employee employee : employeeList) {
            System.out.println("STT: " + autoSTT++ + employee.toString());
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
        System.out.println("Enter Your Employee ID");
        int employeeID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your Level");
        String level = sc.nextLine();
        System.out.println("Enter Your Position");
        String position = sc.nextLine();
        System.out.println("Enter Your Salary");
        int salary = Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(name, birthday, gender, identityCard, phoneNumber, gmail, employeeID, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        //Khi sửa, không được sửa ID
        System.out.println("What Do U Want To Edit ID");
        //int idEdit = Integer.parseInt(sc.nextLine());
        int idEdit = Integer.parseInt(sc.nextLine());
        for (Employee employee : employeeList) {
            if (idEdit == employee.getEmployeeID()) {
                //lấy được ID, in ra thông tin của employee
                System.out.println("ID: " + employee.getEmployeeID());
                // in ra menu lựa chọn trường muốn sửa
                System.out.println("What Do U Want To Edit: ");
                System.out.println("1: Name,\n" +
                        "2: Birthday,\n" +
                        "3: Gender,\n" +
                        "4: IdentityCard,\n" +
                        "5: PhoneNumber,\n" +
                        "6: Gmail,\n" +
                        "7: Level,\n" +
                        "8: Position,\n" +
                        "9: Salary");
                int wantEdit = Integer.parseInt(sc.nextLine());
                switch (wantEdit) {
                    case 1:
                        System.out.println("Edit Name");
                        String newName = sc.nextLine();
                        employee.setName(newName);
                        break;
                    case 2:
                        employee.setBirthday();
                        break;
                    case 3:
                        employee.setGender();

                }
//                String name,
//                int birthday,
//                String gender,
//                int identityCard,
//                int phoneNumber,
//                String gmail,
//                String level,
//                String position,
//                int salary


                // employeeList.remove(employee);

                // nêu chọn sửa hết, sau khi nhập lại các trường, gọi lại hàm SetAll


            }
        }
        System.out.println("Not Found");
    }

    @Override
    public void remove() {

    }
}
