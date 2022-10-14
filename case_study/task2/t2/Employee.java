package case_study.task2.t2;

public class Employee extends Person {
    private String employeeID;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int birthday, String gender, int identityCard, int phoneNumber, String gmail, String employeeID, String level, String position, double salary) {
        super(name, birthday, gender, identityCard, phoneNumber, gmail);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }
}
