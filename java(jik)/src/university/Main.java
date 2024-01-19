package university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day15.student.Student;

public class Main {
	Scanner scan = new Scanner(System.in);
	private ArrayList<Student> list = new ArrayList<Student>();
	
	public class Student {
		private String name;
		private int num, age;
		private String department;
		private List<String> subject;
	}
	
	private void insertStudent() { //학생 등록
		System.out.println("이름: ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("학번: ");
		int num = scan.nextInt();
		System.out.println("나이: ");
		int age = scan.nextInt();
		System.out.println("학과: ");
		scan.nextLine();
		String department = scan.nextLine();
		
		Student std = new Student(name, num, age, department);
		
		if(list.contains(std)) {
			System.out.println("이미 등록된 학생입니다.");
			return;
		}
		list.add(std);
		System.out.println("학생을 추가 했습니다.");
	}
	
	private void insertDepartment() { //과 등록
	}
}

//과 - 과명, 번호, 학생(list), 교수(list)
//학생 - 이름, 학번(), 나이, 과명 / 중복 확인