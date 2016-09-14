
import java.util.*;

public class Division extends Corporate {
	private Corporate[] corporate = new Corporate[100];
	private String name;
	private int number = 0; 

	public Division(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void add(Corporate c) {
		corporate[number++] = c;		
	}

	public void print() {
		Iterator iterator = iterator();
		while (iterator.hasNext()) {
			Corporate c = (Corporate)iterator.next();
			c.print();
		}
	}

	public Iterator iterator() {
		return new DivisionIterator(corporate);
	}
}
