package case_study.models;

public class Employee extends Person {
    private int employeeID;
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String name,
                    int birthday,
                    String gender,
                    int identityCard,
                    int phoneNumber,
                    String gmail,
                    int employeeID,
                    String level,
                    String position,
                    int salary) {
        super(name, birthday, gender, identityCard, phoneNumber, gmail);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // set tất cả các trường, trừ ID

    public void setAll(String name,
                       int birthday,
                       String gender,
                       int identityCard,
                       int phoneNumber,
                       String gmail,
                       String level,
                       String position,
                       int salary){

    }

    @Override
    public String toString() {
        return " Employee" +
                super.toString()+
                "employeeID=" + employeeID +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary ;
    }
}
