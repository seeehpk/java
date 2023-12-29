package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.Data;

public class FunctionInterfaceEx1 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 1, 1, "홍길동", 90, 80, 70));
		list.add(new Student(1, 1, 2, "임꺽정", 100, 100, 100));
		list.add(new Student(1, 1, 3, "고길동", 50, 50, 50));
		
		print(list, s ->{
			System.out.println(s.getGrade() + "학년 " + s.getClassNum() + "반 " + s.getName() + "번호 " + s.getName());
		});
	}
	
	public static void print(List<Student> list, Consumer<Student> consumer) {
		for(Student student : list) {
			consumer.accept(student);
		}
	}

}

@Data
@AllArgsConstructor
class Student{
	int grade, classNum, num;
	String name;
}