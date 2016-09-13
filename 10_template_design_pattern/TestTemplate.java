

public class TestTemplate {

	public static void main (String args[]) {
		AutomativeRobot automativeRobot = new AutomativeRobot("Automative Robot");
		CookieRobot cookieRobot = new CookieRobot("Cookie Robot");

		System.out.println(automativeRobot.getName() + ":");
		automativeRobot.go();
		System.out.println();
		System.out.println(cookieRobot.getName() + ":");
		cookieRobot.go();
	}
}
