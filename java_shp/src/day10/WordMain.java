package day10;

import java.util.Scanner;

public class WordMain {
	/*영어 단어장 프로그램
	 * 1. 기능 정리
	 * - 단어는 영어 단어와 한글 뜻으로 구성
	 * - 영어 단어는 영어이고, 공백이 없는 단어
	 * - 한글 뜻은 한글이고, 한 문장으로 되어 있다
	 * - 한 단어에 한개만 있다고 가정
	 * - 기능
	 * 		- 단어 등록
	 * 		- 단어 검색
	 * 		- 단어 수정
	 * 		- 단어 삭제
	 * - Word 클래스
	 * 		- word : 영단어
	 * 		- meaning : 뜻
	 * 		- 단어 출력, 단어 수정, 단어 확인 : 주어진 문자열과 같은 단어인지 확인
	 * 2. 틀 작성
	 * 2. 필요한 메서드 구현
	 */
	
	private static Scanner scan = new Scanner(System.in);
	private static Word [] list = new Word[10];//단어장
	private static int count = 0;//저장된 단어 개수
	
	public static void main(String[] args) {
		
		int menu;
		
		do {
			printMenu();
			menu = scan.nextInt();
			runMenu(menu);
		}while(menu != 5);
	}
	
	private static void printMenu() {
		System.out.println("===메뉴===");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 삭제");
		System.out.println("5. 종료");
		System.out.println("----------");
		System.out.print("메뉴 선택 : ");
	}
	
	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insert();
			System.out.println("단어 등록");
			break;
		case 2:
			search();
			System.out.println("단어 검색");
			break;
		case 3:
			change();
			System.out.println("단어 수정");
			break;
		case 4:
			delete();
			System.out.println("단어 삭제");
			break;
		case 5:
			System.out.println("프로그램 종료.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	//단어 등록
	private static void insert() {
		System.out.print("단어 : ");
		String word = scan.next();
		System.out.print("의미 : ");
		scan.nextLine();//엔터 처리
		String meaning = scan.nextLine();
		
		//단어와 뜻을 이용하여 Word의 인스턴스를 생성
		Word tmp = new Word(word, meaning);
		
		//위에서 생성한 인스턴스를 단어장에 저장
		list[count] = tmp;
		//저장된 단어의 개수를 1증가
		count++;
		
		//배열이 다 차면
		if(count==list.length) {
			expandWordList();
		}
	}
	
	//단어장 크기 증가
	private static void expandWordList() {
		//기존 단어장보다 큰 새 단어장 생성
		Word[] tmpList = new Word[list.length + 10];
		//새 단어장에 기존 단어들을 복사붙여넣기
		System.arraycopy(list, 0, tmpList, 0, count);
		//새 단어장을 내 단어장이라고 선언
		list = tmpList;
	}

	//단어 검색
	private static void search() {
		System.out.print("단어 : ");
		String word = scan.next();
		
		for(int i=0; i<count; i++) {
			if(list[i].check(word)) {
				list[i].printWord();
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");
	}

	//단어 수정
	private static void change() {
		System.out.print("단어 : ");
		String word = scan.next();
		System.out.print("의미 : ");
		scan.nextLine();//엔터 처리
		String meaning = scan.nextLine();
		
		for(int i=0; i<count; i++) {
			if(list[i].check(word)) {
				list[i].update(meaning);
				System.out.println("단어가 수정되었습니다.");
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");
	}

	//단어 삭제
	private static void delete() {
		System.out.print("단어 : ");
		String word = scan.next();
		
		int index = -1;
		for(int i=0; i<count; i++) {
			if(list[i].check(word)) {
				index = i;
				break;
			}
		}
		//일치하는 단어가 없을 시
		if(index == -1) {
			System.out.println("일치하는 단어가 없습니다.");
			return;
		}
		//저장된 단어의 개수를 1 줄임
		count--;
		System.out.println("삭제가 완료되었습니다.");
		//일치하는 단어가 마지막 단어일 시
		if(index == count) {
			return;
		}
		//한 칸씩 당겨오기
		//현재 배열과 같은 크기의 새 배열을 생성
		Word[] tmpList = new Word[list.length];
		//새 배열에 현재 배열을 복사붙여넣기
		System.arraycopy(list, 0, tmpList, 0, list.length);
		//현재 배열에서 index=1번지부터 단어가 있는 마지막 번지까지 복사해서 새 배열에 index번지부터 복사붙여넣기
		System.arraycopy(tmpList, index+1, list, index, count - index);
	}
	
}