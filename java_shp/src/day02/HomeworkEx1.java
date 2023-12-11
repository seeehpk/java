package day02;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/*성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90이상 100이하 : A
		 * 80이상 90미만 : B
		 * 70이상 80미만 : C
		 * 60이상 70미만 : D
		 * 60미만 : F
		 * 0미만 100초과 : 잘못된 점수
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적 : ");
		int score = scan.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.print("학점은 A입니다.");
		}else if(score >= 80 && score < 90) {
			System.out.print("학점은 B입니다.");
		}else if(score >= 70 && score < 80) {
			System.out.print("학점은 C입니다.");
		}else if(score >= 60 && score < 70) {
			System.out.print("학점은 D입니다.");
		}else if(score < 60) {
			System.out.print("학점은 F입니다.");
		}else {
			System.out.print("잘못된 점수입니다.");
		}
		
		System.out.print("\n");
		
		if(score < 0 || score > 100) {
			System.out.print("잘못된 점수입니다.");
		}else if(score >= 90) {
			System.out.print("학점은 A입니다.");
		}else if(score >= 80) {
			System.out.print("학점은 B입니다.");
		}else if(score >= 70) {
			System.out.print("학점은 C입니다.");
		}else if(score >= 60) {
			System.out.print("학점은 D입니다.");
		}else {
			System.out.print("학점은 F입니다.");
		}
		
		scan.close();
	}
}