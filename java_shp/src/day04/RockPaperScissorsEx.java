package day04;

import java.util.Scanner;

public class RockPaperScissorsEx {

	public static void main(String[] args) {
		/*다음 기능을 가진 가위바위보 게임을 구현하세요.
		 * 1. 새게임
		 * 2. 기록
		 * 3. 프로그램 종료
		 * 
		 * - 새게임
		 * 		- 컴퓨터가 랜덤으로 내는 가위,바위,보와 내가 입력한 가위,바위,보를 비교하여 이기면 승,지면 패, 비기면 무로 기록함
		 * 		- 바위 : R, 보 : P, 가위 : S
		 * - 기록
		 * 		- 승 무 패를 순서대로 출력
		 */
		
		//메뉴 출력
		
		
		Scanner scan = new Scanner(System.in);
		int menu, random;
		char user, com;
		int win = 0, draw = 0, lose = 0;
		int min = 1, max = 3;
		
		//반복문
		do {
			//메뉴 출력
			System.out.println("---------------------");
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("---------------------");
			//메뉴 선택
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			//선택한 메뉴에 맞는 기능 실행
			switch(menu) {
			//1번 선택
			case 1:
				//가위바위보 게임 실행
				//랜덤으로 1~3사이의 숫자 생성
				random = (int)(Math.random() * (max-min+1) + min);
				//1이면 R, 2이면 P, 3이면 S
				com = random == 1 ? 'R' : (random == 2 ? 'P' : 'S');
				
				//사용자 입력
				System.out.print("바위(R), 보(P), 가위(S) 입력 : ");
				user = scan.next().charAt(0);
				
				//사용자와 컴퓨터 비교
				
				//무
				if(user == com) {
					System.out.println("유저 : " + user + "VS 컴퓨터 : " + com);
					System.out.println("무승부!");
					draw++;
				}
				//승
				else if((user == 'R' && com == 'S')||(user == 'S' && com == 'P')||(user == 'P' && com == 'R')) {
					System.out.println("유저 : " + user + "VS 컴퓨터 : " + com);
					System.out.println("유저 승리!");
					win++;
				}
				//패
				else {
					System.out.println("유저 : " + user + "VS 컴퓨터 : " + com);
					System.out.println("유저 패배!");
					lose++;
				}
				
			//2번 선택
			case 2:
				//승무패 기록 출력
				System.out.println(win + "승" + draw + "무" + lose + "패");
				break;
				
			//3번 선택
			case 3:
				//프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}while(menu != 3);
		
		scan.close();
	}
}