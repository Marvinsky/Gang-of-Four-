
public class FullyRentedState implements State {
	AutomateInterface automat;

	public FullyRentedState(AutomateInterface a) {
		automat = a;
	}

	public String gotApplication() {
		return "Sorry, we're fully rented.";
	}

	public String checkApplication() {
		return "Sorry, we're fully rented.";
	}

	public String rentApartment() {
		return "Sorry, we're fully rented.";
	}

	public String dispenseKeys() {
		return "Sorry, we're fully rented.";
	}
}
