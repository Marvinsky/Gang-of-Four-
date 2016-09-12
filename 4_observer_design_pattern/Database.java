import java.util.*;

public class Database implements Subject {
	private Vector observers;
	private String operation;
	private String record;

	public Database() {
		observers = new Vector();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(operation, record);						
		}
	}
}

