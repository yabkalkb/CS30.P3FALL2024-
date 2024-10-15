package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenu;

public class SemesterAvg {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(18, 0, 70));
		frame.setBounds(100, 100, 286, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Semester Avgerage");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(0, 11, 270, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				// Note: Calculate all 3 Semesters.
			}
		});
		
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(28, 0, 108));
		btnNewButton.setBounds(61, 285, 159, 36);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				{
					
				}
			}
		});
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		textField.setBackground(new Color(1, 36, 88));
		textField.setForeground(Color.WHITE);
		textField.setBounds(45, 86, 186, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(1, 36, 88));
		textField_1.setBounds(45, 133, 186, 36);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(1, 36, 88));
		textField_2.setBounds(45, 180, 186, 36);
		frame.getContentPane().add(textField_2);
		
	}
}





