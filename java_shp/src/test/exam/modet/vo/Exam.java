package test.exam.modet.vo;

public class Exam {
	
	public static final String SUBJECT = "JAVA";
	private double score;
	
	public Exam(double score) {
		this.score = score;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public static String getSubject() {
		return SUBJECT;
	}

	public void print() {
		System.out.println(SUBJECT + "과목 점수는 " + score + "점입니다.");
	}

}
