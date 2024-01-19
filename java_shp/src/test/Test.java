package test;

public class Test {

	public static void main(String[] args) {
		Student[] sArr = new Student[2];
		
		Student sArr1 = new Student(1,1,1,"홍길동");
		Student sArr2 = new Student(1,2,3,"임꺽정");
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].getScore);
		}
	}
}