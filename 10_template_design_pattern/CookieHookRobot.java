
public class CookieHookRobot extends RobotHookTemplate {
	private String name;

	public CookieHookRobot(String n) {
		name = n;
	}

	public void getParts() {
		System.out.println("Getting flour and sugar...");
	}

	public void assemble() {
		System.out.println("Baking a cookie...");
	}

	public void test() {
		System.out.println("Testing ENJOY");
	}
	
	public String getName() {
		return name;
	}

	public boolean testOk() {
		return false;
	}
}
