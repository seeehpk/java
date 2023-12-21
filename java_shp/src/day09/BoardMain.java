package day09;

import java.util.Scanner;

public class BoardMain {

	private static Scanner scan = new Scanner(System.in);
	private static Board [] boardList = new Board[5]; //게시글 목록
	private static int boardNum = 1; //추가될 게시글 번호
	private static int count = 0; //현재 등록된 게시글 개수
	
	public static void main(String[] args) {
		/*게시판에서 게시글 관리를 위한 콘솔 프로그램 작성하세요.
		 * 1. 필요한 기능을 정리해서 메뉴로 출력
		 * 2. 기능을 구현
		 */
		
		/*
		Board board = new Board(1, "공지", "테스트", "admin", "2023-12-20");
		board.printInfo();
		board.update("공지-수정", "테스트-수정");
		board.printInfoDetail();
		*/
		
		int menu, submenu;
		
		do {
			printMenu();
			menu = scan.nextInt();
			runMenu(menu);
		}while(menu!=3);
	}
	
	public static void printMenu() {
		System.out.println("---메뉴---");
		System.out.println("1. 게시글 목록 조회");
		System.out.println("2. 게시글 등록");
		System.out.println("3. 프로그램 종료");
		System.out.println("----------");
		System.out.print("메뉴 선택 : ");
	}
	
	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			//게시글 목록을 출력, 번호가 높은 순으로
			for(int i=count-1; i>=0; i--) {
				boardList[i].printInfo();
			}
			printSubmenu();
			int submenu = scan.nextInt();
			runSubmenu(submenu);
			break;
		case 2:
			insertBoard();
			break;
		case 3:
			System.out.println("프로그램 종료.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}
	
	/**게시글 정보를 입력받아 게시글을 등록하는 메서드
	 */
	private static void insertBoard() {
		scan.nextLine(); //입력 버퍼에 남아있는 엔터 처리
		//제목, 내용, 일자, 아이디 순으로 입력받음.
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		System.out.print("일자 : ");
		String date = scan.next();
		System.out.print("작성자 : ");
		String writer = scan.next();
		//입력받은 정보들을 이용하여 게시글 인스턴스를 생성.
		Board board = new Board(boardNum, title, contents, writer, date);
		++boardNum; //추가될 게시글 번호를 1증가
		//생성된 인스턴스를 배열에 저장(몇번지)
		boardList[count] = board;
		++count; //저장된 개수를 1증가
		//배열 크기를 안 늘려도 되면 종료
		if(count < boardList.length) {
			return;
		}
		//배열이 꽉 차면 배열을 늘려줌
		//기존 배열보다 큰 배열 생성
		Board[] tmpList = new Board[boardList.length + 5];
		//새로 생성된 배열에 기존 배열을 복사
		System.arraycopy(boardList, 0, tmpList, 0, count);
		//새로 생성된 배열을 boardList에 연결
		boardList = tmpList;
	}
	
	private static void printSubmenu() {
		System.out.println("---서브 메뉴---");
		System.out.println("1. 게시글 상세 조회");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 뒤로가기");
		System.out.println("----------");
		System.out.print("메뉴 선택 : ");
	}
	
	private static void runSubmenu(int submenu) {
		switch(submenu) {
		case 1://게시글 상세 조회
			printBoardDetail();
			System.out.print("게시글 선택 : ");
			int readBoard = scan.nextInt();
			boardList[readBoard].printInfoDetail();
			break;
		case 2://게시글 수정
			System.out.print("게시글 선택 : ");
			int rewriteBoard = scan.nextInt();
			System.out.print("수정할 제목 : ");
			String title1 = scan.nextLine();
			System.out.print("수정할 내용 : ");
			String contents1 = scan.nextLine();
			boardList[rewriteBoard].update(title1, contents1);
			break;
		case 3://게시글 삭제
			System.out.print("삭제할 게시글 번호 : ");
			int num = scan.nextInt();
			
			break;
		case 4:
			System.out.println("이전으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}
	
}