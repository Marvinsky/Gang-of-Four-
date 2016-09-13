
import java.util.*;

public class AutomativeRobotBuilder implements RobotBuilder {
	AutomativeRobotBuildable robot;
	ArrayList<Integer> actions;

	public AutomativeRobotBuilder() {
		robot = new AutomativeRobotBuildable();
		actions = new ArrayList<Integer>();
	}

        public void addStart() {
                actions.add(new Integer(1));
        }

        public void addGetParts() {
                actions.add(new Integer(2));
        }

        public void addAssemble() {
                actions.add(new Integer(3));
        }

        public void addTest() {
                actions.add(new Integer(4));
        }

        public void addStop() {
                actions.add(new Integer(5));
        }

	public RobotBuildable getRobot() {
		robot.loadActions(actions);
		return robot;
	}
}
