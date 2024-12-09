package AccountPersonalAcctBusinessAcct;

public class PersonalAcct extends Account {
    
    // Constructor
    public PersonalAcct(double bal, String fName, String lName, String street, String city, String province, String postalCode) {
        super(bal, fName, lName, street, city, province, postalCode);
    }

    // Overriding withdrawal method to apply fee if balance goes below $100
    @Override
    public void withdrawal(double amt) {
        super.withdrawal(amt);  // perform the withdrawal
        if (balance < 100) {
            balance -= 2;  // apply fee
            System.out.println("Balance fell below $100. $2 fee charged.");
        }
    }
}
