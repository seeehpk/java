package day06;

import java.util.Scanner;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		//랜덤으로 산수(+,-,*) 문제를 생성하여 맞추는 게임
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		num1 = (int)(Math.random() * 99 + 1);
		num2 = (int)(Math.random() * 99 + 1);
		int random;
		random = (int)(Math.random() * 3 + 1);
		//char을 String으로 바꾸면 밑의 ''를 ""로 바꿔야 함.
		char math = random == 1 ? '+' : (random == 2 ? '-' : '*');
		
		System.out.print("" + num1 + math + num2 + " = "); //String math이면 앞의 ""는 필요없음.
		int user = scan.nextInt();
		
		switch(math) {
		case '+':
			if(user == num1 + num2) {
				System.out.print("정답입니다!");
			}else {
				System.out.println("오답입니다! 답은 " + (num1 + num2) + "입니다.");
			}
			break;
		case '-':
			if(user == num1 - num2) {
				System.out.print("정답입니다!");
			}else {
				System.out.println("오답입니다! 답은 " + (num1 - num2) + "입니다.");
			}
			break;
		case '*':
			if(user == num1 * num2) {
				System.out.print("정답입니다!");
			}else {
				System.out.println("오답입니다! 답은 " + (num1 * num2) + "입니다.");
			}
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
		
		scan.close();
	}
}