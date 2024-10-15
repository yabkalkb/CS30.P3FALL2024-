package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LatinPlantNames {

	//protected static final String  = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 String[] names = {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"};

		frame = new JFrame();
		frame.setBounds(100, 100, 277, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 241, 322);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel latinName = new JLabel("Octimum");
		latinName.setBounds(97, 113, 71, 47);
		panel.add(latinName);
		
		JComboBox plantNames = new JComboBox(names);
		plantNames.setBounds(34, 80, 159, 22);
		panel.add(plantNames);
		plantNames.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent event) 
			{
				JComboBox comboBox = (JComboBox)event.getSource();
				
				String plantName = (String) plantNames.getSelectedItem();
			       if (plantName == "basil") {
			           latinName.setText("Ocimum");
			       } else if (plantName.equals("lavender")) {
			           latinName.setText("Lavandula");
			       } else if (plantName.equals("parsley")) {
			           latinName.setText("Petroselinum");
			       } else if (plantName.equals("peppermint")) {
			           latinName.setText("Mentha piperita");
			       } else if (plantName.equals("saffron")) {
			           latinName.setText("Crocus");
			       } else if (plantName.equals("sage")) {
			           latinName.setText("Salvia");
			       }
			}
		});
		
		  
	   }
}
