package Masterys;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Label;


public class BreakAPlate {
    private JFrame frame;
    private JLabel[] plates = new JLabel[3];
    private JButton playButton;
    private JLabel resultLabel;
    private ImageIcon unbrokenPlate, brokenPlate;
    private JLabel lblNewLabel;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BreakAPlate window = new BreakAPlate();
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
    public BreakAPlate() {
        initialize();
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 408);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());


        // Load plate images (adjust paths to the correct images)
        unbrokenPlate = new ImageIcon("unbroken_plate.png"); // Replace with actual path
        brokenPlate = new ImageIcon("broken_plate.png");     // Replace with actual path


        // Plate panel
        JPanel platePanel = new JPanel();
        for (int i = 0; i < plates.length; i++) {
            plates[i] = new JLabel(unbrokenPlate);
            platePanel.add(plates[i]);
        }


        // Result label
        resultLabel = new JLabel(" ");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);


        frame.getContentPane().add(platePanel, BorderLayout.CENTER);
        platePanel.setLayout(null);
        
        // C:\\Users\\1100062345\\Downloads\\plates_all_broken.gif
        lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(85, 25, 308, 80);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\1100062345\\Downloads\\plates.gif"));
        platePanel.add(lblNewLabel);
        ChangeImage(lblNewLabel, "plates");
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(85, 219, 308, 80);
        platePanel.add(lblNewLabel_3);
        frame.getContentPane().add(resultLabel, BorderLayout.NORTH);

     // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(184, 142, 96, 33);
        platePanel.add(buttonPanel);
        playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Random random = new Random();
                int brokenCount = 0;
                
                ChangeImage(lblNewLabel, "plates_all_broken");

            	 // Generate random values and update plate images
                for (int i = 0; i < plates.length; i++) {
                    int randValue = random.nextInt(2);  // Generate 0 or 1
                    if (randValue == 1) {
                        plates[i].setIcon(brokenPlate);
                        brokenCount++;
                    } else {
                        plates[i].setIcon(unbrokenPlate);
                    }
                }


                // Determine result based on number of broken plates
                if (brokenCount == 3) 
                {
                    resultLabel.setText("You win: Tiger Plush!");
                    ChangeImage(lblNewLabel, "plates_all_broken");
                    ChangeImage(lblNewLabel_3, "tiger_plush");
                } 
                else
                {
                    resultLabel.setText("You win: Sticker!");
                    ChangeImage(lblNewLabel, "plates_two_broken");
                    ChangeImage(lblNewLabel_3, "sticker");
                }
             
                // Change button to "Play Again"
                playButton.setText("Play Again");
        	}
     
        });
        buttonPanel.add(playButton);
    }
    
    public static void ChangeImage(JLabel uiObject, String imageID) 
    {
    	uiObject.setIcon(new ImageIcon("C:\\Users\\1100062345\\Downloads\\" + imageID + ".gif"));
    }
}

