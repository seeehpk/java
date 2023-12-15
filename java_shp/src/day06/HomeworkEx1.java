package day06;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/*숫자 야구게임을 구현하세요.
		 * - 1~9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * - S : 숫자가 있고, 위치가 같은 경우
		 * - B : 숫자가 있지만, 위치가 다른 경우
		 * - O : 일치하는 숫자가 하나도 없는 경우
		 * - 3S가 되면 게임이 종료
		 */
		Scanner sc = new Scanner(System.in);
		int num =3;
		int [] com = new int[num];
		int [] user = new int[num];
		int strike=0, ball=0;
		
		System.out.println("숫자 야구게임을 시작합니다.");
		
		//컴퓨터
		//1~9사이의 중복되지 않은 랜덤한 수 3개를 저장
		int min = 1, max = 9;
		int count = 0;
		while( count < 3 ) {
			int r = (int)(Math.random()*(max - min + 1) + min);
			//중복 확인
			boolean duplicated = false;//중복 여부를 알려주는 변수로, true이면 중복, false이면 중복이 아님
			for(int i = 0; i < count; i++) {
				if(com[i] == r) {
					duplicated = true;
					break;
				}
			}
			//중복되지 않으면 저장 후 count 증가
			if(!duplicated) {
				com[count] = r;
				count++;
			}
		}
		//랜덤수 확인출력
		System.out.print("랜덤으로 생성된 숫자 : ");
		for(int i = 0; i<com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		
		//유저
		do {
			System.out.print("숫자 입력 : ");
			for(int i=0; i<user.length; i++) {
				user[i] = sc.nextInt();
			}
			
			//SBO 확인
			for(int i=0; i<com.length; i++) {
				//S : 숫자가 있고, 위치가 같은 경우
				if(com[i] == user[i]) {
					strike++;
				}else {//B : 숫자가 있지만, 위치가 다른 경우
					for(int j=0; j<user.length; j++) {
						ball = com[i] == user[j] ? ++ball : ball; //++ball을 ball+1로는 바꿀 수 있지만, ball++로는 바꿀 수 없다.
					}
				}
			}
			
			//성적 출력
			System.out.print("결과 : ");
			if(strike==0 && ball==0) {//O : 일치하는 숫자가 하나도 없는 경우
				System.out.print("O");
			}else if(strike==0){
				System.out.print(ball + "B");
			}else if(ball==0){
				System.out.print(strike + "S ");
			}else {
				System.out.print(strike + "S " + ball + "B");
			}
			
		}while(user == com);//임시
		
		sc.close();
	}
}