import java.io.*;
import java.net.*;
public class AutomateServer implements Runnable, AutomateInterface {
	State state;
	State waitingState;
	State gotApplicationState;
	State apartmentRentedState;
	int count;

	public AutomateServer() {
		count = 9;
		waitingState = new WaitingState(this);
		gotApplicationState = new GotApplicationState(this);
		apartmentRentedState = new ApartmentRentedState(this);
		state = waitingState;

		try {
			socket = new ServerSocket(8765);
			communicationSocket = socket.accept();
			out = new PrintWriter(communicationSocket.getOutputStream(), true);
			thread = new Thread(this);
			thread.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void run() {
		String incomingString;
		try {
			BufferedReader in = new BufferedReader(new
			InputStreamReader(communicationSocket.getInputStream()));

			while ((incomingString = in.readLine()) != null) {
				if (incomingString.equals("gotApplication")) {
					gotApplication();
				} else if (incomingString.equals("checkApplication")) {
					checkApplication();
				} else if (inommingString.equals("rentApartment")) {
					rentApartment();
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

