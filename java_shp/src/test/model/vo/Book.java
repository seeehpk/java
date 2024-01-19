package test.model.vo;

public class Book {
	
	String title;
	int price;
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public Book(String title1, int price1) {
		title = title1;
		price = price1;
	}
	
	@Override
	public String toString() {
		return "책 : " + title + ", 가격 : " + price;
	}
	
	public void fileSave(String fileName) {
		
	}
	
}