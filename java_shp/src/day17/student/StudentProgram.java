package day17.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import program.Program;

public class StudentProgram implements Program {
	
	private StudentManager sm = new StudentManager();
	private Scanner scan = new Scanner(System.in);
	private final int EXIT = 3;

	@Override
	public void run() {
		int menu=0;
		
		load();
		do {
			printMenu();
			try {
				menu = scan.nextInt();
				runMenu(menu);
			}catch(Exception e) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				scan.nextLine();
			}
		}while(menu != EXIT);
		save();
	}

	private void load(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis))
		sm.setList((ArrayList<Student>))ois.readObject();
				System.out.println(".");
	}

	private void save() {
		try(FileOutputStream fos = new FileOutputStream("");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(sm.getList());
			System.out.println("저장하기를 성공했습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("지정된 위치에 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("저장에 실패했습니다.");
		}
	}

	@Override
	public void printMenu() {
		System.out.println("===메뉴===");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 조회");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			throw new InputMismatchException();
		}
	}
}
