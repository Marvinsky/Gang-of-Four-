
public class Student {
	private String name;
	private int id;
	private int score;
	private double averageScore;

	public Student (double a) {
		this.averageScore = a;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getStanding() {
		return (((double)score)/averageScore - 1.0)* 100.0;
	}
}
