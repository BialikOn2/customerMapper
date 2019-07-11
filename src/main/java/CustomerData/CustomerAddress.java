package CustomerData;

public class CustomerAddress {
    private String street;
    private String city;
    private int postal;

    public CustomerAddress(String street, String city, int postal) {
        this.street = street;
        this.city = city;
        this.postal = postal;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    @Override
    public String toString() {
        return "address{" +
                "streetAddress='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postal +
                '}';
    }
}
