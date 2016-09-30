
public class USServer implements Receiver {
	public USServer() {

	}

	public void connect() {
		System.out.println("You are connected to the US Server.");
	}

	public void diagnostics() {
		System.out.println("The US Server diagnostics check out Ok.");
	}

	public void shutdown() {
		System.out.println("Shutting down the US Server.");
	}

	public void reboot() {
		System.out.println("Rebooting the US Server.");
	}

	public void disconnect() {
		System.out.println("You are disconnected from the US Server.");
	}
}
