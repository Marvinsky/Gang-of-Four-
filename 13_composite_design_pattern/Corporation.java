
import java.util.*;

public class Corporation extends Corporate {
	private ArrayList<Corporate> corporate = new ArrayList<Corporate>();

	public Corporation() {

	}

	public void add(Corporate c) {
		corporate.add(c);
	}

	public void print() {
		Iterator iterator = corporate.iterator();
		while (iterator.hasNext()) {
			Corporate c = (Corporate)iterator.next();
			c.print();
		}
	}
}


