 package Masterys;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LocalBankGUI {


    private JFrame frame;
    private JTextField accountNumberField;
    private JTextField amountField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField beginningBalanceField;
    private JLabel accountInfoLabel;


    // Placeholder for account data
    private double balance;
    private boolean accountExists;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LocalBankGUI window = new LocalBankGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


    /**
     * Create the application.
     */
    public LocalBankGUI() {
        initialize();
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        // Dropdown for selecting action
        JComboBox<String> actionComboBox = new JComboBox<>();
        actionComboBox.addItem("Deposit");
        actionComboBox.addItem("Withdraw");
        actionComboBox.addItem("Check Balance");
        actionComboBox.addItem("Delete Account");
        actionComboBox.setBounds(160, 20, 120, 20);
        frame.getContentPane().add(actionComboBox);


        // Labels and TextFields for Input
        JLabel lblAccountNumber = new JLabel("Account number:");
        lblAccountNumber.setBounds(20, 60, 120, 20);
        frame.getContentPane().add(lblAccountNumber);


        accountNumberField = new JTextField();
        accountNumberField.setBounds(160, 60, 180, 20);
        frame.getContentPane().add(accountNumberField);


        JLabel lblAmount = new JLabel("Amount (if applicable):");
        lblAmount.setBounds(20, 90, 180, 20);
        frame.getContentPane().add(lblAmount);


        amountField = new JTextField();
        amountField.setBounds(210, 90, 130, 20);
        frame.getContentPane().add(amountField);


        JLabel lblFirstName = new JLabel("First Name:");
        lblFirstName.setBounds(20, 120, 100, 20);
        frame.getContentPane().add(lblFirstName);


        firstNameField = new JTextField();
        firstNameField.setBounds(160, 120, 180, 20);
        frame.getContentPane().add(firstNameField);


        JLabel lblLastName = new JLabel("Last Name:");
        lblLastName.setBounds(20, 150, 100, 20);
        frame.getContentPane().add(lblLastName);


        lastNameField = new JTextField();
        lastNameField.setBounds(160, 150, 180, 20);
        frame.getContentPane().add(lastNameField);


        JLabel lblBeginningBalance = new JLabel("Beginning Balance:");
        lblBeginningBalance.setBounds(20, 180, 120, 20);
        frame.getContentPane().add(lblBeginningBalance);


        beginningBalanceField = new JTextField();
        beginningBalanceField.setBounds(160, 180, 180, 20);
        frame.getContentPane().add(beginningBalanceField);


        // Label to display account info
        accountInfoLabel = new JLabel("Account Info Displayed Here");
        accountInfoLabel.setBounds(20, 220, 400, 20);
        frame.getContentPane().add(accountInfoLabel);


        // Button to process the transaction
        JButton btnProcessTransaction = new JButton("Process Transaction");
        btnProcessTransaction.addActionListener(e -> processTransaction(actionComboBox.getSelectedItem().toString()));
        btnProcessTransaction.setBounds(150, 250, 150, 30);
        frame.getContentPane().add(btnProcessTransaction);
    }


    /**
     * Process the transaction based on input data.
     */
    private void processTransaction(String action) {
        String accountNumber = accountNumberField.getText();
        String amount = amountField.getText();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String beginningBalance = beginningBalanceField.getText();


        // Handle the existence of the account
        if (action.equals("Delete Account")) {
            deleteAccount(accountNumber);
            return;
        }


        if (!accountExists && !action.equals("Check Balance")) {
            // Initialize account if it does not exist
            balance = Double.parseDouble(beginningBalance);
            accountExists = true;
        }


        // Process the transaction
        if (action.equals("Deposit")) {
            double transactionAmount = Double.parseDouble(amount);
            balance += transactionAmount;
            accountInfoLabel.setText("Deposited: $" + transactionAmount);
        } else if (action.equals("Withdraw")) {
            double transactionAmount = Double.parseDouble(amount);
            if (transactionAmount <= balance) {
                balance -= transactionAmount;
                accountInfoLabel.setText("Withdrew: $" + transactionAmount);
            } else {
                accountInfoLabel.setText("Insufficient funds for withdrawal.");
            }
        } else if (action.equals("Check Balance")) {
            accountInfoLabel.setText(String.format("Current Balance: $%.2f", balance));
            return; // No need to update further info
        }


        // Update the displayed account info
        accountInfoLabel.setText(String.format("Account: %s | Name: %s %s | Balance: $%.2f",
                accountNumber, firstName, lastName, balance));
    }


    /**
     * Delete the account and reset the relevant fields.
     */
    private void deleteAccount(String accountNumber) {
        if (accountExists) {
            balance = 0;
            accountExists = false;
            accountInfoLabel.setText("Account " + accountNumber + " deleted.");
            clearFields();
        } else {
            accountInfoLabel.setText("Account does not exist.");
        }
    }


    /**
     * Clear the input fields after account deletion.
     */
    private void clearFields() {
        accountNumberField.setText("");
        amountField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        beginningBalanceField.setText("");
    }
}

