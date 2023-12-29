package day15.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
	@NonNull
	private int grade, classNum, num;
	@NonNull
	private String name;
	private int kor, eng, math;
}

