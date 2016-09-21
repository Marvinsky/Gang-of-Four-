

import java.util.*;
import java.lang.Math;

public class GotApplicationState implements State {
	AutomateInterface automat;
	Random random;

	public GotApplicationState(AutomateInterface a) {
		automat = a;
		random = new Random(System.currentTimeMillis());
	}

	public String gotApplication() {
		return "We already got your application.";
	}

	public String checkApplication() {
		int yesno = random.nextInt() % 10;

		if (yesno > 4 && automat.getCount() > 0) {

		}

	}
}


