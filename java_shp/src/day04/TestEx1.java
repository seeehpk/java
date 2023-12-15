package day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		//Scanner를 이용하여 국어, 영어, 수학 성적을 입력받고, 총점과 평균을 구하는 코드를 작성하세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적 입력(국어, 영어, 수학 순) : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		//double avg = (double)sum / 3;
		
		System.out.println("총점 : " + sum + ", 평균 : " + avg);
		
		scan.close();
	}
}