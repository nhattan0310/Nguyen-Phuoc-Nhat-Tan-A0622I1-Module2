package case_study.models;

public class Customer extends Person {
    private String customerCode;
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String name,
                    int birthday,
                    String gender,
                    int identityCard,
                    int phoneNumber,
                    String gmail,
                    String customerCode,
                    String typeCustomer,
                    String address) {
        super(name, birthday, gender, identityCard, phoneNumber, gmail);
        this.customerCode = customerCode;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "customerCode='" + customerCode + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
