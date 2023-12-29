package day15.student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentProgram implements Program{

	private Scanner scan = new Scanner(System.in);
	private final int EXIT = 4;
	private List<Student> list = new
	
	@Override
	public void run() {
		int menu = 0;
		do {
			printMenu();
			try {
				menu = scan.nextInt();
				runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				scan.nextLine();
			}
		}while(menu != EXIT);
	}

	@Override
	public void printMenu() {
		System.out.println("===메뉴===");
		System.out.println("1. 학생 관리");
		System.out.println("2. 성적 관리");
		System.out.println("3. 조회");
		System.out.println("4. 종료");
	}
	
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			studentManager();
			break;
		case 2:
			scoreManager();
			break;
		case 3:
			check();
			break;
		case 4:
			break;
		default:
			throw new InputMismatchException();
		}
	}

	@Override
	public void studentManager() {
		printStudentMenu();
		int menu = scan.nextInt();
		runStudentMenu(menu);
	}

	private void printStudentMenu() {
		System.out.println("===학생관리===");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("메뉴 선택 : ");
	}

	private void runStudentMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			changeStudent();
			break;
		case 3:
			deleteStudent();
			check();
			break;
		default:
			throw new InputMismatchException();
		}
	}

	
	private int kor, eng, math;
	
	
	private void insertStudent() {
		System.out.println("이름, 학년, 반, 번호 : ");
		String name = scan.next();
		int grade = scan.nextInt(), classNum = scan.nextInt(), num = scan.nextInt();
		
		Student std = new Student(1, 1, 1, "홍길동");
		
	}

	private void changeStudent() {
		
	}

	private void deleteStudent() {
		
	}

	@Override
	public void scoreManager() {
		System.out.println("2. 성적 관리");
	}

	@Override
	public void check() {
		System.out.println("3. 조회");
	}

}