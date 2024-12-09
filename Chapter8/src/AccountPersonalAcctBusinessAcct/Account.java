package AccountPersonalAcctBusinessAcct;

import java.text.NumberFormat;

public class Account {
    protected double balance;
    protected Customer cust;
    protected String acctID;

    // Constructor with customer data and balance
    public Account(double bal, String fName, String lName, String street, String city, String province, String postalCode) {
        balance = bal;
        cust = new Customer(fName, lName, street, city, province, postalCode);
        acctID = fName.substring(0,1) + lName;
    }

    // Constructor with only account ID
    public Account(String ID) {
        balance = 0;
        cust = new Customer("", "", "", "", "", "");
        acctID = ID;
    }

    // Getters for ID and balance
    public String getID() {
        return acctID;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amt) {
        balance += amt;
    }

    // Withdrawal method with fee checks in subclasses
    public void withdrawal(double amt) {
        balance -= amt;
    }

    // Change the customer's address
    public void changeAddress(String street, String city, String province, String postalCode) {
        cust.changeStreet(street);
        cust.changeCity(city);
        cust.changeProvince(province);
        cust.changePostalCode(postalCode);
    }

    // Check if two accounts are the same
    public boolean equals(Object acct) {
        Account testAcct = (Account) acct;
        return acctID.equals(testAcct.acctID);
    }

    // Return a String that represents the Account object
    public String toString() {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        return acctID + "\n" + cust.toString() + "\nCurrent balance is " + money.format(balance);
    }
}
