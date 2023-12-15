package day06;

import java.util.Scanner;

public class AlphabetCountEx1 {

	public static void main(String[] args) {
		//단어를 입력받아 각 알파벳이 몇번 나왔는지 출력하는 코드
		
		/*
		String str = "Hello";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		*/
		
		//단어를 입력 => 문자열을 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("영단어 입력 : ");
		String word = scan.next();
		
		int abc[] = new int[26];
		
		//반복문으로 문자열의 길이만큼 반복
		for(int i=0; i<word.length(); i++) {
			//문자열의 각 문자를 가져옴
			char ch = word.charAt(i);
			System.out.println(ch);
			//가져온 문자의 배열 번지에 숫자를 증가
			//가져온 문자가 a면 0번지에 있는 숫자를 1증가, b면 1번지에 있는 숫자를 1증가
			abc[ch='a']++;
		}
		//반복문으로 배열의 크기만큼(26개) 반복
			//개수가 0이 아닌 알아벳들을 출력
		
		for(int i = 1; i<abc.length; i++) {
			if(abc[i] != 0) {
				char ch = (char)('a' + i);
			System.out.println(ch + " : " + abc[i]);
			}
		}
		
		char ch = 'a';
		for(int count : abc) {
			if(count != 0) {
				System.out.println(ch + " : " + count);
			}
			ch++;
		}
		
		scan.close();
	}
}