
public class ApartmentRentedState implements State {
	public AutomateInterface automat;

	public ApartmentRentedState(AutomateInterface a) {
		automat = a;
	}

	public String gotApplication() {
		return "";
	}

	public String checkApplication() {
		return "";
	}

	public String rentApartment() {
		automat.setCount(automat.getCount() - 1);
		return "Renting you an apartment.";
	}

	public String dispenseKeys() {
		if (automat.getCount() <= 0) {
			automat.setState(automat.getFullyRentedState());
		} else {
			automat.setState(automat.getWaitingState());
		}
		return "Here are yours keys!";
	}	
}
