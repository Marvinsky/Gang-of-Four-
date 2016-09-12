import java.lang.*;

public class FirstFactory {
	protected String type;

	public FirstFactory (String t) {
		type = t;
	}

	public Connection createConnection() {
		if (type.equals("Oracle")) {
			return new OracleConnection();
		} else if (type.equals("SQLServer")) {
			return new SQLServerConnection();
		} else {
			return new MySQLConnection();
		}
	}
}




