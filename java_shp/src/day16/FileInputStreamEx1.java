package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/day16/fileEx1.txt");
			for(int i=0; i<3; i++) {
				//아스키코드로 읽음.
				int num = fis.read();
				//아스키코드를 다시 문자로 변환 후 출력.
				System.out.print((char)num);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			System.out.println("파일을 닫을 수 없습니다.");
		}
	}
}