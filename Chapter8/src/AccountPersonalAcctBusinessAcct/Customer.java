package AccountPersonalAcctBusinessAcct;

public class Customer {
    private String firstName, lastName;
    private String street, city, province, postalCode;

    // Constructor now includes address details
    public Customer(String fName, String lName, String street, String city, String province, String postalCode) {
        this.firstName = fName;
        this.lastName = lName;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    // Methods to change address details
    public void changeStreet(String street) {
        this.street = street;
    }

    public void changeCity(String city) {
        this.city = city;
    }

    public void changeProvince(String province) {
        this.province = province;
    }

    public void changePostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // Returns a String that represents the Customer object, including address details
    public String toString() {
        return firstName + " " + lastName + "\n" +
               street + "\n" +
               city + ", " + province + " " + postalCode;
    }
}
