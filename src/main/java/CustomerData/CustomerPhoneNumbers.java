package CustomerData;

public class CustomerPhoneNumbers {
    private String type;
    private String number;

    public CustomerPhoneNumbers(String type, String number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "phoneNumbers{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
