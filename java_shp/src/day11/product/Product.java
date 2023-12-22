package day11.product;

public class Product {
	//제품명, 수량, 구매금액, 판매금액
	private String name;
	private int amount, buyPrice, salePrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public Product(String name, int amount, int buyPrice, int salePrice) {
		this.name = name;
		this.amount = amount;
		this.buyPrice = buyPrice;
		this.salePrice = salePrice;
	}
	
	public void print() {
		System.out.println("제품명:"+name+", 수량:"+amount+", 구매금액:"+buyPrice+", 판매금액:"+salePrice);
	}
	
}