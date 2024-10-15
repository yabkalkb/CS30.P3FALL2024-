package Masterys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

public class MetricConverter {

	//protected static final String  = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConverter window = new MetricConverter();
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
	public MetricConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 String[] ConList = {"Inches to Centrimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"};

		frame = new JFrame();
		frame.setBounds(100, 100, 277, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 11, 241, 336);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Formulas = new JLabel("1 Inch = 2.54 Centimeters");
		Formulas.setBounds(54, 113, 159, 47);
		panel.add(Formulas);
		
		JComboBox Conversions = new JComboBox(ConList);
		Conversions.setOpaque(false);
		Conversions.setLightWeightPopupEnabled(false);
		Conversions.setForeground(Color.BLACK);
		Conversions.setFont(new Font("Verdana", Font.BOLD, 10));
		Conversions.setBackground(Color.WHITE);
		Conversions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Conversions.setBounds(44, 80, 168, 22);
		panel.add(Conversions);
		Conversions.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent event) 
			{
				JComboBox comboBox = (JComboBox)event.getSource();
				
				String Conversions = (String)comboBox.getSelectedItem();
			       if (Conversions == "Inches to Centrimeters") {
			           Formulas.setText("1 Inch = 2.54 Centimeters");
			       } else if (Conversions.equals("Feet to Meters")) {
			           Formulas.setText("1 Foot = 0.3048 Meters");
			       } else if (Conversions.equals("Gallons to Liters")) {
			           Formulas.setText("1 Gallon = 4.5461 Liters");
			       } else if (Conversions.equals("Pounds to Kilograms")) {
			           Formulas.setText("1 Pound = 0.4536 Kilograms");
			       }
			}
		});
		
		  
	   }
}
