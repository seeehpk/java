package day11.product;

import java.util.Scanner;

public class ProductMain {
	/*제품을 관리하는 프로그램을 구현하세요.
	 * 메뉴
	 * 1. 제품 입고
	 * 	- 제품을 판매하기 위해 다른 곳에서 제품을 구매
	 * 2. 제품 판매
	 * 	- 입고된 제품을 판매
	 * 3. 제품 수정[가격]
	 * 4. 매출 내역 조회
	 * 5. 종료
	 */
	
	private static Scanner scan = new Scanner(System.in);
	private static Product [] productList = new Product[5];//제품 목록
	private static int count = 0;//현재 제품 종류
	private static Product [] saleList = new Product[5];//판매 목록
	private static int saleCount = 0;//매출
	
	public static void main(String[] args) {
		int menu;
		do {
			printMenu();
			menu = scan.nextInt();
			runMenu(menu);
		}while(menu!=5);
	}
	
	private static void printMenu() {
		System.out.println("===메뉴===");
		System.out.println("1. 제품 입고");
		System.out.println("2. 제품 판매");
		System.out.println("3. 제품 수정[가격]");
		System.out.println("4. 매출 내역 조회");
		System.out.println("5. 종료");
		System.out.println("----------");
		System.out.print("메뉴 선택 : ");
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 0://임시
			for(int i=0; i<count; i++) {
				productList[i].print();
			}break;
		case 1://제품 입고
			storeProduct();
			break;
		case 2://제품 판매
			saleProduct();
			break;
		case 3://제품 수정[가격]
			updateProduct();
			break;
		case 4://매출 내역 조회
			printSales();
			break;
		case 5://종료
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	private static void storeProduct() {
		System.out.print("입고 (제품, 수량) : ");
		String addName = scan.next();
		int addAmount= scan.nextInt();
		
		//수량이 0일 경우
		if(addAmount == 0) {
			System.out.println("제품을 한개 이상 입력하세요.");
			return;
		}
		
		//제품이 이미 있을 경우
		for(int i=0; i<count; i++) {
			if(productList[i].getName().equals(addName)) {
				productList[i].setAmount(productList[i].getAmount()+addAmount);
				return;
			}
		}
		
		//제품이 없을 경우
		System.out.print("구매가격, 판매가격 : ");
		int buyPrice= scan.nextInt(), salePrice= scan.nextInt();
		//Product의 인스턴스 생성
		Product tmp = new Product(addName, addAmount, buyPrice, salePrice);
		//위의 인스턴스를 목록에 저장
		productList[count] = tmp;
		//저장된 제품의 종류를 1증가
		count++;
		
		//배열이 다 차면 크기를 늘림
		if(count == productList.length) {
			productList = expandList(productList);
		}
	}

	//배열 크기 늘리기
	private static Product[] expandList(Product[] list) {
		Product[] tmpList = new Product[list.length + 5];
		System.arraycopy(list, 0, tmpList, 0, list.length);
		return tmpList;
	}
	
	private static void saleProduct() {
		//등록 제품 목록 출력
		for(int i=0; i<count; i++) {
			productList[i].print();
		}
		//제품 지정
		System.out.print("판매 (제품, 수량) : ");
		String saleName = scan.next();
		int saleAmount= scan.nextInt();
		
		//수량이 0일 경우
		if(saleAmount == 0) {
			System.out.println("제품을 한개 이상 입력하세요.");
			return;
		}
		
		//판매
		for(int i=0; i<=count; i++) {
			if(productList[i].getName().equals(saleName)) {
				//재고가 충분할 경우
				if(productList[i].getAmount()>saleAmount) {
					//재고 감소
					productList[i].setAmount(productList[i].getAmount()-saleAmount);
					
					System.out.println("판매가 완료되었습니다.");
					return;
				}
				//재고가 부족할 경우
				System.out.println("재고가 부족합니다.");
				return;
			}
		}
		System.out.println("제품이 없습니다.");
	}

	private static void updateProduct() {
		System.out.print("수정 (제품, 가격) : ");
		String updateName = scan.next();
		int updatePrice= scan.nextInt();
		
		for(int i=0; i<count; i++) {
			if(productList[i].getName().equals(updateName)) {
				productList[i].setPrice(updatePrice);
				return;
			}
		}
		System.out.println("제품이 없습니다.");
	}
	
	private static void printSales() {
		System.out.println("매출 내역 조회");
		for(int i=0; i<count; i++) {
			System.out.println(productList[i].getName() + " : " + productList[i].getSold() + " 판매");
		}
		System.out.println("총 매출액 : " + money);
	}
	
}












