//Add Phidgets Library
import com.phidget22.*;
public class Box {
 public static void main(String[] args) throws Exception {
     //Connect to wireless rover
     Net.addServer("", "192.168.100.1", 5661, "", 0);
     //Create
     DCMotor leftMotors = new DCMotor();
     DCMotor rightMotors = new DCMotor();
     //Address
     leftMotors.setHubPort(5);
     leftMotors.setChannel(0);
     rightMotors.setHubPort(5);
     rightMotors.setChannel(1);
     //Open
     leftMotors.open(5000);
     rightMotors.open(5000);
     //Increase acceleration
     leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
     rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
      //Move forward at full speed
     leftMotors.setTargetVelocity(1);
     rightMotors.setTargetVelocity(1);
     //Wait for 1 second
     Thread.sleep(1800);
    
  
     leftMotors.setTargetVelocity(0);
     rightMotors.setTargetVelocity(1);
    
     Thread.sleep(505);
    
     leftMotors.setTargetVelocity(1);
     rightMotors.setTargetVelocity(1);
     //Wait for 1 second
     Thread.sleep(1800);
    
     leftMotors.setTargetVelocity(0);
     rightMotors.setTargetVelocity(1);
    
     Thread.sleep(505);
    
     leftMotors.setTargetVelocity(1);
     rightMotors.setTargetVelocity(1);
     //Wait for 1 second
     Thread.sleep(1800);
    
     leftMotors.setTargetVelocity(0);
     rightMotors.setTargetVelocity(1);
    
     Thread.sleep(505);
    
     leftMotors.setTargetVelocity(1);
     rightMotors.setTargetVelocity(1);
     //Wait for 1 second
     Thread.sleep(1800);
    
     leftMotors.setTargetVelocity(0);
     rightMotors.setTargetVelocity(1);
    
     Thread.sleep(7760);
    
     leftMotors.setTargetVelocity(0);
     rightMotors.setTargetVelocity(0);
    
    
 }
}


  