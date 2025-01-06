import com.phidget22.*;

public class Box {
    public static void main(String[] args) throws Exception {

        // Connect to the wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        // Create motor objects
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        // Assign channels to motors (left motor on channel 0, right motor on channel 1)
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        // Open motor connections
        leftMotors.open(5000);
        rightMotors.open(5000);

        // Move forward
        leftMotors.setTargetVelocity(1);  // Move forward
        rightMotors.setTargetVelocity(1); // Move forward

        // Wait for 3 seconds to move forward (adjust the time based on the distance you want to travel)
        Thread.sleep(500);  // Move forward for 3 seconds

        // Turn 180° - rotate in place
        leftMotors.setTargetVelocity(0);  // Left motor reverse (backward)
        rightMotors.setTargetVelocity(0);  // Right motor forward

        // Wait for 2 seconds to complete the 180° turn (adjust this duration based on your rover's turn speed)
        Thread.sleep(1000);  // Turn for 2 seconds to achieve a 180° turn

        // Move back to the starting position (reverse direction)
        leftMotors.setTargetVelocity(1); // Move backward
        rightMotors.setTargetVelocity(0); // Move backward

        // Wait for the same amount of time to move backward as we did forward (to return to the starting position)
        Thread.sleep(790);  // Same duration as the forward movement (3 seconds)

        // Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000);
        
        leftMotors.setTargetVelocity(1);  // Move forward
        rightMotors.setTargetVelocity(1); // Move forward
        
        Thread.sleep(500);  // Move forward for 3 seconds
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000);
        
        leftMotors.setTargetVelocity(1); // Move backward
        rightMotors.setTargetVelocity(0); // Move backward

        // Wait for the same amount of time to move backward as we did forward (to return to the starting position)
        Thread.sleep(790);  // Same duration as the forward movement (3 seconds)
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000);
        
        leftMotors.setTargetVelocity(1);  // Move forward
        rightMotors.setTargetVelocity(1); // Move forward
        
        Thread.sleep(500);  // Move forward for 3 seconds
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000);
        
        leftMotors.setTargetVelocity(1); // Move backward
        rightMotors.setTargetVelocity(0); // Move backward

        // Wait for the same amount of time to move backward as we did forward (to return to the starting position)
        Thread.sleep(790);  // Same duration as the forward movement (3 seconds)
        
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000);
        
        
        leftMotors.setTargetVelocity(1);  // Move forward
        rightMotors.setTargetVelocity(1); // Move forward
        
        Thread.sleep(500);  // Move forward for 3 seconds
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000);
        
        leftMotors.setTargetVelocity(1); // Move backward
        rightMotors.setTargetVelocity(0); // Move backward

        // Wait for the same amount of time to move backward as we did forward (to return to the starting position)
        Thread.sleep(790);  // Same duration as the forward movement (3 seconds)
        
        
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        Thread.sleep(1000);
        
    
    }
}


  