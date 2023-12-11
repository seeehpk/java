package day02;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		//산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자 입력 (예: 1 + 2) : ");
		int num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		//앞에 ""를 붙이지 않으면 num1+operator의 operator까지 정수로 바뀌어서 계산해 버린다.
		//System.out.print(num1 + operator + num2 + " = ");
		System.out.print(""+num1 + operator + num2 + " = ");
		System.out.print(num1 + " " + operator + " " + num2 + " = ");
		
		if(operator == '+') {
			System.out.print(num1 + num2);
		}else if(operator == '-') {
			System.out.print(num1 - num2);
		}else if(operator == '*') {
			System.out.print(num1 * num2);
		}else if(operator == '/') {
			System.out.print(num1 / (double)num2);
		}else if(operator == '%') {
			System.out.print(num1 % num2);
		}else {
			System.out.print(operator + "는 산술 연산자가 아닙니다.");
		}
		
		scan.close();
	}
}