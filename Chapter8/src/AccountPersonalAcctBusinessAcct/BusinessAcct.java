package AccountPersonalAcctBusinessAcct;

public class BusinessAcct extends Account {
    
    // Constructor
    public BusinessAcct(double bal, String fName, String lName, String street, String city, String province, String postalCode) {
        super(bal, fName, lName, street, city, province, postalCode);
    }

    // Overriding withdrawal method to apply fee if balance goes below $500
    @Override
    public void withdrawal(double amt) {
        super.withdrawal(amt);  // perform the withdrawal
        if (balance < 500) {
            balance -= 10;  // apply fee
            System.out.println("Balance fell below $500. $10 fee charged.");
        }
    }
}

