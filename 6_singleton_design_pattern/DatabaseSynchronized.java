
public class DatabaseSynchronized {
	private int record;
	private String name;
	private static DatabaseSynchronized singleObject;

	private DatabaseSynchronized(String n) {
		name = n;
		record = 0;
	}

	public static synchronized DatabaseSynchronized getInstance(String n) {
		if (singleObject == null) {
			singleObject = new DatabaseSynchronized(n);
		}
		return singleObject;
	}

	public String getName() {
		return name;
	}
}
