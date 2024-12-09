package AccountPersonalAcctBusinessAcct;


public class AccountPersonalAcctBusinessAcct {
    public static void main(String[] args) {
        
        // Create a Personal account with an initial balance of $150
        PersonalAcct personalAcct = new PersonalAcct(150, "John", "Doe", "123 Main St", "Toronto", "ON", "M1A 2B3");
        
        // Create a Business account with an initial balance of $1000
        BusinessAcct businessAcct = new BusinessAcct(1000, "Jane", "Smith", "456 Business Rd", "Vancouver", "BC", "V6B 2C4");

        // Print initial account details
        System.out.println(personalAcct);
        System.out.println(businessAcct);
        
        // Withdraw $60 from the personal account, it should still be above $100, no fee applied
        personalAcct.withdrawal(60);
        System.out.println(personalAcct);
        
        // Withdraw $100 from the business account, it should still be above $500, no fee applied
        businessAcct.withdrawal(100);
        System.out.println(businessAcct);
        
        // Withdraw enough money to trigger fees in both accounts
        personalAcct.withdrawal(150); // should trigger fee
        businessAcct.withdrawal(600); // should trigger fee

        // Print final account details after withdrawals
        System.out.println(personalAcct);
        System.out.println(businessAcct);
    }
}
