package case_study.models;

public class Person {
    private String name;
    private int birthday;
    private String gender;
    private int identityCard;
    private int phoneNumber;
    private String gmail;

    public Person() {
    }

    public Person(String name, int birthday, String gender, int identityCard, int phoneNumber, String gmail) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.gmail = gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday() {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", identityCard=" + identityCard +
                ", phoneNumber=" + phoneNumber +
                ", gmail='" + gmail + '\'' ;
    }
}
