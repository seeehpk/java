package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		//정수를 5개 입력받아 입력받은 정수를 리스트에 저장하고 출력하는 코드를 작성하세요.
		
		//정수를 여러개 저장하기 위해 ArrayList 인스턴스를 생성.
		//정수이기 때문에 Integer를 추가. int가 안되는 이유는 제네릭은 클래스만 올 수 있어서.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//콘솔창에서 다양한 값을 입력받기 위한 Scanner 인스턴스를 생성.
		//콘솔창에서 입력받아야 하기 때문에 표준 입력인 System.in 인스턴스를 전달.
		Scanner scan = new Scanner(System.in);
		//입력받을 정수의 개수.
		int count = 5;
		System.out.println("정수 5개를 입력하세요 : ");
		for(int i=0; i<count; i++) {
			int tmp = scan.nextInt();
			list.add(tmp);
		}
		
		for(int tmp : list) {
			System.out.println(tmp);
		}
	}

}
