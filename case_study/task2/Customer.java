package case_study.task2;

public class Customer extends Person {
    private String country;

    public Customer() {
    }

    public Customer(String country) {
        this.country = country;
    }

    public Customer(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "country='" + country + '\'' +
                super.toString();
    }
}
