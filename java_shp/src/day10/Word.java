package day10;

public class Word {

	//단어, 뜻
	private String word, meaning;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	//단어 출력, 단어 수정, 단어 확인
	
	public void printWord() {
		//단어 : 뜻
		System.out.println(word + " : " + meaning);
	}
	
	public void update(String meaning) {
		this.meaning = meaning;
	}
	
	public boolean check(String word) {
		return this.word.equals(word);
	}
	
	//주어진 단어와 뜻으로 단어와 뜻을 초기화하는 생성자
	public  Word(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}
	
}










