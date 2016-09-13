
public class TestSingletonSynchronized implements Runnable {
	
	Thread thread;
	public static void main (String args[]) {
		TestSingletonSynchronized t = new TestSingletonSynchronized();
	}
	
	public TestSingletonSynchronized() {
		DatabaseSynchronized database;
		database = DatabaseSynchronized.getInstance("product");

		thread = new Thread(this, "second");
		thread.start();

		System.out.println("This is the " + database.getName() + " datasbase.");
	}

	public void run() {
		DatabaseSynchronized database = DatabaseSynchronized.getInstance("marketing");
		System.out.println("This is the " + database.getName() + " datasbase.");
	}

}
