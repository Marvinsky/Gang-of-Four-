
public class TestStudentThreaded implements Runnable  {	
	Thread thread;
	public static void main(String args[]) {
		TestStudentThreaded t = new TestStudentThreaded();
	}

	public TestStudentThreaded() {
		String names[] = {"Ralph", "Alice", "Sam"};
		int ids[] = {1001, 1002, 1003};
		int scores[] = {45, 55, 65};

		double total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}

		double averageScore = total/scores.length;

		StudentThreaded student = StudentThreaded.getInstance();

		student.setAverageScore(averageScore);

		student.setName("Ralph");
		student.setId(1001);
		student.setScore(45);

		thread = new Thread(this, "second");
		thread.start();

		System.out.println("Name: " + student.getName() + ", Standing: " + Math.round(student.getStanding()));
	}

	public void run() {
		StudentThreaded student = StudentThreaded.getInstance();	
		System.out.println("Name: " + student.getName() + ", Standing: " + Math.round(student.getStanding()));
	}
}
