package robot;

public class RobotMap {

	public static final int PORT_DRIVE_LEFT, PORT_DRIVE_RIGHT;
	public static final int PORT_SHOOTER, PORT_LOADER;

	public static final boolean POLARITY_SHOOTER, POLARITY_LOADER;

	private static final RIOConfigs CONFIGS;

	// This static initializer gets run when RobotMap is loaded as a Class. So
	// long as the static initializers of any other classes don't refer to the
	// constants defined here, no conflicts will occur.
	static {
		CONFIGS = RIOConfigs.getInstance(System.getProperty("user.home") + "/robotconfigs.txt");

		// The following lines of code set all the ports. If robotconfigs.txt
		// did not exist, it does now (it was created by the getInstance()
		// method). If any of the configs do not exist, they will be created
		// with the default values supplied

		// I don't recommend you use inconsistent naming schemes or lambda
		// expressions. This is meant to demonstrate options.

		PORT_DRIVE_LEFT = Integer.parseInt(CONFIGS.getConfig("port driveLeft", "0"));//since the getConfig(String, String) method returns a String, we have to parse it
		PORT_DRIVE_RIGHT = CONFIGS.getConfig("port driveRight", 1, Integer::parseInt);
		PORT_SHOOTER = CONFIGS.getConfig("port loader", 2, Integer::parseInt);
		PORT_LOADER = CONFIGS.getConfig("port shooter", 3, Integer::parseInt);

		POLARITY_LOADER = CONFIGS.getConfig("loader inverted", false, Boolean::parseBoolean);
		POLARITY_SHOOTER = CONFIGS.getConfig("shooter reversed", true, s -> Boolean.parseBoolean(s));
	}

}
