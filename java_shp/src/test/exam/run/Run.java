package test.exam.run;

import test.exam.modet.vo.Exam;

public class Run {

	public static void main(String[] args) {
		Exam e = new Exam(0);
		e.setScore(92.4);
		e.print();
	}

}
