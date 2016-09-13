

public class TestHookTemplate {

	public static void main (String arg[]) {
		CookieHookRobot cookieHookRobot = new CookieHookRobot("Cookie Robot");
		System.out.println(cookieHookRobot.getName() + ":");
		cookieHookRobot.go();
	}
}

