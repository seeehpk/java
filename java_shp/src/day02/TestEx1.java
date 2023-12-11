package day02;

public class TestEx1 {

	//연산자 예제
	public static void main(String[] args) {
		// 다음 코드를 이용하여 국어, 영어, 수학 성적의 평균을 구하여 콘솔에 출력하는 코드를 작성하세요.
		int korScore = 100, engScore = 50, mathScore = 92;
		
		System.out.println("평균 : " + (korScore + engScore + mathScore)/(double)3);
		
		int sum = 0;
		double avg = 0.0;
		sum = korScore + engScore + mathScore;
		avg = (double)sum/3;
		System.out.println("평균 : " + avg);
	}
}