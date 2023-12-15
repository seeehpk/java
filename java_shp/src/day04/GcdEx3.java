package day04;

public class GcdEx3 {

	public static void main(String[] args) {
		/*두 정수의 최대 공약수를 출력하는 코드를 작성하세요.
		 * 최대 공약수 : 공통으로 있는 약수
		 * 
		 * 반복회수 : i는 1부터 num1까지 1씩 증가.
		 * 규칙성 : i가 num1과 num2의 약수이면 gcd에 i를 저장.
		 * 반복문종료후 : gcd를 출력.
		 */
		int num1 = 8, num2 = 12;
		
		//1부터 공약수들을 하나씩 구해서 덮어쓰기.
		int gcd = 1;
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(num1 + "과 " + num2 + "의 최대 공약수 : " + gcd);
		
		//num1부터 공약수를 구해서 처음 구한 공약수가 최대 공약수가 됨.
		for(int i = num1; i >= 1; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.print(num1 + "과 " + num2 + "의 최대 공약수 : " + i);
				break;
			}
		}

	}
}