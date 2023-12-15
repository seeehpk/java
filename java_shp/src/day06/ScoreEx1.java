package day06;

import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int menu, submenu;
		int student, subject, score;
		
		int max = 30;
		int [] kor = new int[max], eng = new int[max], math = new int[max];
		
		do {//---메인 메뉴
			System.out.println("==메뉴==");
			System.out.println("1. 성적수정");
			System.out.println("2. 성적조회");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1://--성적수정
				System.out.println("--성적수정--");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				
				System.out.print("과목 선택 : ");
				subject = scan.nextInt();
				System.out.print("학생 선택 : ");
				student = scan.nextInt();
				System.out.print("성적 입력 : ");
				score = scan.nextInt();
				
				switch(subject) {
				case 1: kor[student-1] = score; break;
				case 2: eng[student-1] = score; break;
				case 3: math[student-1] = score; break;
				}
				
				break;
			case 2://--성적조회
				System.out.println("--성적조회--");
				System.out.println("1. 과목별조회");
				System.out.println("2. 학생별조회");
				System.out.print("선택 : ");
				submenu = scan.nextInt();
				
				switch(submenu) {
				case 1://-과목별조회
					System.out.println("--과목별조회--");
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.print("과목 선택 : ");
					subject = scan.nextInt();
					
					int []selectedSubject = null;
					
					switch(subject) {
					case 1: selectedSubject = kor; break;
					case 2: selectedSubject = eng; break;
					case 3: selectedSubject = math; break;
					default: System.out.println("잘못된 과목입니다.");
					}
					if(selectedSubject != null) {
						for(int i = 0; i<selectedSubject.length; i++) {
							System.out.println((i+1) + "번 : " + selectedSubject[i] + "점");
						}
					}
					break;
				case 2://-학생별조회
					System.out.print("학생 선택 : ");
					student = scan.nextInt();
					
					System.out.println("국어 " + kor[student-1] + "점");
					System.out.println("영어 " + eng[student-1] + "점");
					System.out.println("수학 " + math[student-1] + "점");
				}
				break;
			case 3://--프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			default:	System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu!=3);
		
		scan.close();
	}
}