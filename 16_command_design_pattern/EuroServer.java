
public class EuroServer implements Receiver {
	public EuroServer() {

	}

	public void connect() {
		System.out.println("You are connected to the Euro Server.");
	}

	public void diagnostics() {
		System.out.println("The Euro server diagnostics check out OK.");
	}

	public void shutdown() {
		System.out.println("Shutting down the Euro Server.");
	}

	public void reboot() {
		System.out.println("Rebooting the Euro Server.");
	}

	public void disconnect() {
		System.out.println("You are disconnected from the Euro Server.");
	}
}
