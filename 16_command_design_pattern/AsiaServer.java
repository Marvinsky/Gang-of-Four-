
public class AsiaServer implements Receiver {
	public AsiaServer() {

	}

	public void connect() {
		System.out.println("You are connected to the Asia Server.");
	}

	public void diagnostics() {
		System.out.println("The Asia server diagnostics check out Ok.");
	}

	public void shutdown() {
		System.out.println("Shutting down the Asia Server.");
	}

	public void reboot() {
		System.out.println("Rebooting the Asia Server.");
	}

	public void disconnect() {
		System.out.println("You are disconnected from the Asia Server.");
	}
}
