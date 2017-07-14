package robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	
	private SpeedController left, right;
	
	public DriveTrain() {
		left = new Talon(RobotMap.PORT_DRIVE_LEFT);
		right = new Talon(RobotMap.PORT_DRIVE_RIGHT);
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}
	
	public void setRaw(double left, double right) {
		this.left.set(left);
		this.left.set(right);
	}
	
}
