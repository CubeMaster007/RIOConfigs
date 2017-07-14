package robot;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * 
 * This is an example robot project using the RIOConfigs utility class. The main
 * interest of this project is in RobotMap. RobotMap uses a static initializer
 * to create all of its constants. Before it creates the constants, it creates a
 * RIOConfigs instance with a file, robotconfigs.txt. If this file does not
 * exist on the RoboRIO, it is created. It then reads all of the ports and
 * polarities from that file, and creates them with default values if they don't
 * exist. Were this same program to run on a different RoboRIO, and the wires to
 * be swapped around on that RoboRIO, the only change that would be necessary
 * would be of robotconfigs.txt. No recompiling or reuploading needed. This
 * could be done via SSH or FTP (tutorials on WPILib). This flexibility should
 * make electrical changes much easier to deal with, debugging easier, and
 * competition smoother.
 * 
 * @author Adam Mendenhall
 *
 */
public class Robot extends IterativeRobot {
	@Override
	public void robotInit() {
	}
}
