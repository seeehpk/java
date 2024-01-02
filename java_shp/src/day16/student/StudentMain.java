package day16.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	/*다음 기능을 가진 프로그램을 만드세요.
	 * - 학생 관리 프로그램
	 * - 기능
	 * 	1. 학생 추가
	 * 	2. 학생 조회
	 * 	3. 종료
	 * - 학생은 학년, 반, 번호, 이름을 가진다.
	 * - 저장 기능과 불러오기 기능을 통해 학생 정보들을 유지.
	 */
	
	static Scanner scan = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();
	
	public static void main(String[] args) {
		int menu=0;
		String fileName = "src/day16/student/list.txt";
		
		load(fileName);
		do {
			try {
				printMenu();
				menu = scan.nextInt();
				runMenu(menu);
			}catch(Exception e) {
				System.out.println("예외가 발생했습니다.");
			}
		}while(menu != 3);
		save(fileName);
	}

	private static void load(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			list = (List<Student>)ois.readObject();
			System.out.println("학생 정보를 불러왔습니다.");
		} catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		}
	}
	
	private static void save(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("저장에 실패했습니다.");
		}
	}

	private static void printMenu() {
		System.out.println("===메뉴===");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 조회");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	private static void runMenu(int menu) {
		switch(menu) {
		case 1://학생 추가
			insertStudent();
			break;
		case 2://학생 조회
			printStudent();
			break;
		case 3://종료
			System.out.print("프로그램을 종료합니다.");
			break;
		default:
			throw new RuntimeException();
		}
	}

	private static void insertStudent() {
		System.out.print("학년, 반, 번호, 이름 : ");
		int grade=scan.nextInt(), classNum=scan.nextInt(), num=scan.nextInt();
		String name=scan.next();
		
		Student std = new Student(grade, classNum, num, name);
		
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("학생을 추가했습니다.");
			return;
		}
		System.out.println("등록된 학생입니다.");
	}

	private static void printStudent() {
		list.stream().forEach(s->System.out.println(s));
	}
}