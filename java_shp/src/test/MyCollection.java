package test;

import java.util.ArrayList;

public class MyCollection {
	
	public void test() {
		ArrayList<Test> list = new ArrayList<Test>();
		list.add(new Test("자바", 93.5));
		list.add(new Test("디비", 74.1));
		list.add(new Test("서버", 82.7));
		//list.add(100);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
