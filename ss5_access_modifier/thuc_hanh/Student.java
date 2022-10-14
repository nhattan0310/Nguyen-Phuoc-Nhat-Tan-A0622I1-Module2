package ss5_access_modifier.thuc_hanh;

public class Student {
    private static String id ="123";
    private String name;
    private double point;

    public Student() {
    }

    public Student(String name, double point) {
        this.name = name;
        this.point = point;

    }
    static void change(){
        id="NhatTan";
    }
    void display(){
        System.out.println(id+" "+ name+ " " + point);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student("nap",2);
        Student s2 = new Student("nao",2);
        s1.display();
        s2.display();
    }
}
