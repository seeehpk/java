package day02;

public class LogicalOperatorEx1 {

	//논리 연산자 예제
	public static void main(String[] args) {
		/* && : ~하고, ~이고
		 * A && B : A와 B는 참/거짓을 판별할 수 있는 식 또는 변수
		 * - 성적이 100이하이고, 성적이 90이상이면 A, 성적이 95 => true
		 * - 100이고, 90이다 A, 성적이 95 => 판별할 수 없다 => 에러 발생
		 * (T=true, F=faulse)
		 * - 진리표
		 * A && B
		 * F && F => F
		 * F && T => F
		 * T && F => F
		 * T && T => T (둘다 참일 때 참, 하나라도 거짓이면 거짓)
		 * 
		 * || : ~이거나, ~하거나
		 * A || B
		 * - 진리표
		 * F || F => F (둘다 거짓일 때 거짓, 하나라도 참이면 참)
		 * F || T => T
		 * T || F => T
		 * T || T => T
		 * 
		 * ! : ~아닌, 반대
		 * !A
		 * F => T
		 * T => F
		 */
		
		int score = 90; //성적
		//성적이 올바른지 확인. 올바른 성적은 0이상 100이하.
		//성적이 0이상이고, 성적이 100이하이다.
		//성적이 0보다 크거나 같고, 성적이 100보다 작거나 같다.
		//성적이 0보다 (크거나 같)(고), 성적이 100보다 (작거나 같다).
		//성적 >= 0 && 성적 <= 100
		System.out.println(score + "점은 올바른 성적인가? " + (score >= 0 && score <= 100));
		System.out.println(score + "점은 올바른 성적이 아닌가? " + !(score >= 0 && score <= 100));
		System.out.println(score + "점은 올바른 성적이 아닌가? " + (score < 0 || score > 100));
	}
}