package CustomerData;

public class CustomerDataDetails {
    private String firstName;
    private String lastName;
    private int age;
    private CustomerAddress address;
    private CustomerPhoneNumbers phoneNumbers;

    public CustomerDataDetails() {
    }

    public CustomerAddress getAddress() {
        return address;
    }

    public void setAddress(String street, String city, int postal) {
        this.address = new CustomerAddress(street, city, postal);
    }

    public CustomerPhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String type, String phoneNumber) {
        this.phoneNumbers =new CustomerPhoneNumbers(type, phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "customerDataDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", pNumbers=" + phoneNumbers +
                '}';
    }
}
