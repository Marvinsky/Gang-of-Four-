
public class ShutDownCommand implements Command {
	Receiver receiver;

	public ShutDownCommand(Receiver r) {
		receiver = r;
	}

	public void execute() {
		receiver.connect();
		receiver.shutdown();
		receiver.disconnect();
		System.out.println();
	}
}
