package student;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;

	public Student() {
		super();
	}

	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public double getAvg() {
		double avg = (double)(korean + english + math + science) / 4;
		return avg;
	}

	public String getGrade(double d) {
		String grade = null;
		if (d >= 90 && d <= 100)
			grade = "A";
		else if (d < 90 && d >= 70)
			grade = "B";
		else if (d < 70 && d >= 50)
			grade = "C";
		else if (d > 50 && d >= 30)
			grade = "D";
		else
			grade = "F";
		return grade;
	}

	@Override
	public String toString() {
		return name+" 평균: "+getAvg()+" 학점: "+getGrade(getAvg())+"학점";
	}
	
}
