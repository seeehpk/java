package team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordMain {

	static Scanner scan = new Scanner(System.in);
	static List<Word> list = new ArrayList<Word>();
	
	public static void main(String[] args) {
		int menu=0;
		String fileName = "src/team/wordList.txt";
		
		load(fileName);
		do {
			try {
				printMenu();
				menu = scan.nextInt();
				runMenu(menu);
			}catch(Exception e) {
				System.out.println("예외가 발생했습니다.");
			}
		}while(menu != 4);
		save(fileName);
	}

	private static void load(String fileName) {
		// TODO Auto-generated method stub
		
	}

	private static void save(String fileName) {
		// TODO Auto-generated method stub
		
	}

	private static void printMenu() {
		System.out.println("===메뉴===");
		System.out.println("1. 단어 조회");
		System.out.println("2. 단어 관리");
		System.out.println("3. 문제 풀기");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1://단어 조회
			printWord();
			break;
		case 2://단어 관리
			try {
				printSubMenu();
				menu = scan.nextInt();
				runSubMenu(menu);
			}catch(Exception e) {
				System.out.println("예외가 발생했습니다.");
			}
			break;
		case 3://문제 풀기
			break;
		case 4://종료
			System.out.print("프로그램을 종료합니다.");
			break;
		default:
			throw new RuntimeException();
		}
	}
	
	private static void printWord() {
		list.stream().forEach(s->System.out.println(s));
	}

	private static void printSubMenu() {
		System.out.println("===단어 관리===");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 돌아가기");
		System.out.print("메뉴 선택 : ");
	}
	
	private static void runSubMenu(int menu) {
		switch(menu) {
		case 1://단어 추가
			insertWord();
			break;
		case 2://단어 수정
			updateWord();
			break;
		case 3://단어 삭제
			deleteWord();
			break;
		case 4://돌아가기
			break;
		default:
			throw new RuntimeException();
		}
	}
	
	private static void insertWord() {
		System.out.print("단어, 품사, 뜻 : ");
		String word=scan.next(), wordClass=scan.next(), meaning=scan.next();
		
		Word wd = new Word(word, wordClass, meaning);
		
		if(!list.contains(wd)) {
			list.add(wd);
			System.out.println("단어를 추가했습니다.");
		}
		System.out.println("등록된 단어입니다.");
	}

	private static void updateWord() {
		System.out.print("단어 : ");
		String word=scan.next();
		
		Word wd = new Word(word, null, null);
		
		if(list.equals(wd)) {
			
		}
	}

	private static void deleteWord() {
		// TODO Auto-generated method stub
		
	}

}