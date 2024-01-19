package test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class test3 {

	public void output() {
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("test.txt", true));
			bw.write("안녕하세요");
			bw.write("반갑습니다");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
