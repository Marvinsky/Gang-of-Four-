

import java.io.*;

public class Shop {
	Mediator mediator;
	String response = "n";

	public Shop(Mediator m) {
		mediator = m;
	}

	public void go() {
		System.out.println("Are you ready to purcharse? [y/n]");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch(IOException e) {
			System.err.println("Error");
		}

		if (response.equals("y")) {
			mediator.handle("shop.purchase");
		} else {
			mediator.handle("shop.exit");
		}
	}
}



