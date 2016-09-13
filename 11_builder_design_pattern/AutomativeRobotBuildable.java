
import java.util.*;
public class AutomativeRobotBuildable implements RobotBuildable {
	ArrayList<Integer> actions;
	
	public AutomativeRobotBuildable() {

	}

	public void loadActions(ArrayList a) {
		actions = a;
	}

	public void go() {
		Iterator itr = actions.iterator();
		while (itr.hasNext()) {
			switch((Integer)itr.next()) {
				case 1:
					start();
					break;
				case 2:
					getParts();
					break;
				case 3:
					assemble();
					break;
				case 4:
					test();
					break;
				case 5:
					stop();
					break;
			}
		}
	}

	public void start() {
		System.out.println("Starting movement of the car...");
	}

	public void getParts() {
		System.out.println("Getting the parts together...");
	}

	public void assemble() {
		System.out.println("Assembling the car...");
	}

	public void test() {
		System.out.println("Testing how the car works...");
	}

	public void stop() {
		System.out.println("Stopping the car..");
	}
}
