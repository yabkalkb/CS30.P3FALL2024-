//Add Phidgets Library
import com.phidget22.*;
public class Move {
   public static void main(String[] args) throws Exception {
       //Connect to wireless rover
       Net.addServer("", "192.168.100.1", 5661, "", 0);
       //Create
       DCMotor leftMotors = new DCMotor();
       DCMotor rightMotors = new DCMotor();
       //Address
       leftMotors.setChannel(0);
       rightMotors.setChannel(1);
       //Open
       leftMotors.open(5000);
       rightMotors.open(5000);
       //Vilocity both controls the direction in which the wheels will turn ( 1 and -1). The speed is also determined. 1 and -1 are the max speeds. Any decimals in between are slower speeds.
       leftMotors.setTargetVelocity(0.5);
       rightMotors.setTargetVelocity(0.5);
       // How long the code will run for
       Thread.sleep(6000);
       //Stop motors
       leftMotors.setTargetVelocity(0);
       rightMotors.setTargetVelocity(0);
   }
}
 
