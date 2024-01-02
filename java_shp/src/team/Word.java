package team;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Word implements Serializable {
	private static final long serialVersionUID = 8263061182636454219L;
	private String word;
	private String wordClass, meaning;
}