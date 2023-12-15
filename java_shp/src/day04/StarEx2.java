package day04;

public class StarEx2 {

	public static void main(String[] args) {
		/*아래와 같이 출력되도록 작성하세요.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 반복회수 : i는 1부터 5까지 1씩 증가.
		 * 규칙성 : *을 i개 출력 후 엔터
		 * 			반복회수 : j는 1부터 i까지
		 * 			규칙성 : *을 출력
		 * 			반복문종료후 : 엔터
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}