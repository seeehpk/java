package test;

import java.util.Scanner;

public class printNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(": ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			for(int i = 0; 2*i+1 <= num; i++) {
				System.out.println(2*i+1 + " ");
			}
		} else {
			System.out.println("x");
		}
	}

}
