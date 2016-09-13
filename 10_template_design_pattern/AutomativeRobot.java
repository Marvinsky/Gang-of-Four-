
public class AutomativeRobot extends RobotTemplate {
	private String name;

	public AutomativeRobot(String n) {
		name = n;
	}

	public void getParts() {
		System.out.println("Getting a carburator...");
	}

	public void assemble() {
		System.out.println("Installing the carburator...");
	}

	public void test() {
		System.out.println("Reviewing the engine...");
	}

	public String getName() {
		return name;
	}
}
