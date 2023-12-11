package day02;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		/*월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11: 가을
		 * 12,1,2 : 겨울
		 * 그 외 : 잘못된 월
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int mon = scan.nextInt();
		
		if(mon == 3 || mon == 4 || mon == 5) {
			System.out.println("봄입니다.");
		}else if(mon == 6 || mon == 7 || mon == 8){
			System.out.println("여름입니다.");
		}else if(mon == 9 || mon == 10 || mon == 11){
			System.out.println("가을입니다.");
		}else if(mon == 12 || mon == 1 || mon == 2){
			System.out.println("겨울입니다.");
		}else {
			System.out.println("잘못된 월입니다.");
		}
		
		if(mon < 1 || mon > 12) {
			System.out.println("잘못된 월입니다.");
		}else if(mon <= 2 || mon == 12){
			System.out.println("겨울입니다.");
		}else if(mon <= 5){
			System.out.println("봄입니다.");
		}else if(mon <= 8){
			System.out.println("여름입니다.");
		}else {
			System.out.println("가을입니다.");
		}
		
		scan.close();
	}
}