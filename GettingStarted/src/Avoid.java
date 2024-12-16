
import com.phidget22.*;

public class Avoid {
    public static void main(String[] args) throws Exception {

        // Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);
        
        int TimeFromLastBackup = 0;
        boolean TurnLeft = false;
        int FailedBackup = 0;

        // Create motor and sensor objects
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        // Set motor channels
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        // Open motors and sensor with timeout
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);

        // Set sonar data interval to 100 milliseconds (10 times per second)
        sonar.setDataInterval(100);

        // Main loop
        while (true) {

            // Get the distance from the sonar sensor
            double distance = sonar.getDistance();
            System.out.println("Distance: " + distance + " mm");
            TimeFromLastBackup++;
            System.out.println("Time Last Backup: " + (double) TimeFromLastBackup / 100 + "s");
            
            // Object detected! (less than 200mm)
            if (distance < 200) {
                // Back up for 2 seconds (reverse direction)
                System.out.println("Object detected, backing up!");
                int StuckTime = 0;
                int TimeStuck = 0;
                boolean RandomlyPickedDirection = Math.random() == -0 ? true : false;
                
                while (true) 
                {
                	distance = sonar.getDistance();
                	
                	double ReverseAmount = 0.5 - (0.5 * (Math.clamp(distance, 0, 100) / 100));
                    ReverseAmount = Math.clamp(-ReverseAmount, -0.5, -0.25);
                	
                	System.out.println(ReverseAmount + "%");
                	leftMotors.setTargetVelocity(ReverseAmount);  // Move backward slowly
                    rightMotors.setTargetVelocity(ReverseAmount); // Move backward slowly
                	
                	if (distance >= 100) 
                	{
                		System.out.println("Not locked anymore");
                		StuckTime = 0;
                		break;
                	}
                	
                	StuckTime++;
                	
                	if (StuckTime == 200) 
                	{
                		distance = sonar.getDistance();
                	    
                    	if (RandomlyPickedDirection) 
                    	{
                    		leftMotors.setTargetVelocity(0.50);  // Move backward on left motor
                            rightMotors.setTargetVelocity(-0.50);  // Move forward on right motor
                    	}
                    	else 
                    	{
                    		leftMotors.setTargetVelocity(-0.50);  // Move backward on left motor
                            rightMotors.setTargetVelocity(0.50);  // Move forward on right motor
                    	}
                    	
                    	if (TimeStuck == 100) 
                    	{
                    		System.out.println("I'm fully stuck");
                    	}

                    	System.out.println("Distance: " + distance + " mm");
                    	 
                    	if (distance > 200) 
                    	{
                    		break;
                    	}
                        
                        Thread.sleep(10);
                        TimeStuck++;
                	}
                }

                // Turn to avoid obstacle (left turn for example)
                System.out.println("Turning to avoid obstacle!");

            	distance = sonar.getDistance();

            	if (RandomlyPickedDirection) 
            	{
            		leftMotors.setTargetVelocity(0.50);  // Move backward on left motor
                    rightMotors.setTargetVelocity(-0.50);  // Move forward on right motor
            	}
            	else 
            	{
            		leftMotors.setTargetVelocity(-0.50);  // Move backward on left motor
                    rightMotors.setTargetVelocity(0.50);  // Move forward on right motor
            	}
            	
            	if (TimeStuck == 300) 
            	{
            		System.out.println("Nigga I'm fully stuck");
            	}

            	System.out.println("Distance: " + distance + " mm");
                
                Thread.sleep(700);
            } else {
                // No object detected, move forward at higher speed (50% of max speed)
                leftMotors.setTargetVelocity(0.40);  // Move forward faster (75% speed)
                rightMotors.setTargetVelocity(0.40); // Move forward faster (75% speed)
            }

            // Wait for 100 milliseconds (to match the sonar's update interval)
            Thread.sleep(100);
        }
    }
}
