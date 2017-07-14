package robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	
	SpeedController motor;
	
	public Shooter() {
		motor = new Talon(RobotMap.PORT_SHOOTER);
		motor.setInverted(RobotMap.POLARITY_SHOOTER);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void setRaw(double speed) {
		motor.set(speed);
	}
	
}
