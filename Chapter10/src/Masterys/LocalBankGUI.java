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

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LocalBankGUI window = new LocalBankGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
        frame.setBounds(100, 100, 450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Dropdown for selecting Deposit/Withdraw
        JComboBox<String> actionComboBox = new JComboBox<>();
        actionComboBox.addItem("Deposit");
        actionComboBox.addItem("Withdraw");
        actionComboBox.setBounds(160, 20, 120, 20);
        frame.getContentPane().add(actionComboBox);

        // Labels and TextFields for Input
        JLabel lblAccountNumber = new JLabel("Account number:");
        lblAccountNumber.setBounds(20, 60, 120, 20);
        frame.getContentPane().add(lblAccountNumber);

        accountNumberField = new JTextField();
        accountNumberField.setBounds(160, 60, 180, 20);
        frame.getContentPane().add(accountNumberField);

        JLabel lblAmount = new JLabel("Amount of deposit/withdrawal:");
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
        btnProcessTransaction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processTransaction(actionComboBox.getSelectedItem().toString());
            }
        });
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

        // Assuming you have backend logic to handle deposits/withdrawals in the Masterys package
        double balance = Double.parseDouble(beginningBalance);
        double transactionAmount = Double.parseDouble(amount);

        if (action.equals("Deposit")) {
            balance += transactionAmount;
        } else if (action.equals("Withdraw")) {
            balance -= transactionAmount;
        }

        // Update the displayed account info
        accountInfoLabel.setText(String.format("Account: %s | Name: %s %s | Balance: $%.2f",
                accountNumber, firstName, lastName, balance));
    }
}


