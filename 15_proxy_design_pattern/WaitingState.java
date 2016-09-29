
public class WaitingState implements State {
	AutomateInterface automat;

	public WaitingState(AutomateInterface a) {
		automat = a;
	}

	public String gotApplication() {
		automat.setState(automat.getGotApplicationState());
		return "Thanks for the application.";
	}

	public String checkApplication() {
		return "You have to submit an application.";
	}

	public String rentApartment() {
		return "You have to submit an application.";
	}

	public String dispenseKeys() {
		return "You have to submit an application.";
	}
}
