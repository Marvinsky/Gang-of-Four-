
public class TestDatabase {

	public static void main(String args[]) {
		Database database;
		database = Database.getInstance("products");
		System.out.println("This is the " + database.getName() + " database.");
		System.out.println("");
		database = Database.getInstance("marketing");	
		System.out.println("This is the " + database.getName() + " database.");
	}
}
