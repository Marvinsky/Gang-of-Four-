
public class TestFactory {

	public static void main (String[] args) {
		SecureFactory factory;
		factory = new SecureFactory();

		Connection connection = factory.createConnection("SQLServer");

		System.out.println("You are connecting with " + connection.getDescription());
	}
}



