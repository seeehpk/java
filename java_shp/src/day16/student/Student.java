package day16.student;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable{//학년, 반, 번호, 이름
	private static final long serialVersionUID = -1017476836734688619L;
	private int grade, classNum, num;
	private String name;
}