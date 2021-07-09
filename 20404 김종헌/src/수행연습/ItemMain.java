package 수행연습;

public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "에 오신걸 환영합니다");
		System.out.println("현재 상품 종류 개수:" + Item.getItemCnt());
		System.out.println("===================================");
		
		Item i1 = new Item();
		i1.setNo(101);
		i1.setName("연필");
		i1.setPrice(1000);
		i1.setCount(100);
		Item i2 = new Item(102,"노트");
		i2.setPrice(1000);
		i2.setCount(100);
		Item i3 = new Item(103,"지우개",1000,100);
		i1.printInfo();
		i2.printInfo();
		i3.printInfo();
		System.out.println("===================================");
		System.out.println("현재 상품 종류 개수:" + Item.getItemCnt());
		System.out.println("===================================");
		i1.inStore(20);
		i2.inStore(20);
		i2.outStore(10);
		i3.inStore(30);
		i3.outStore(60);
		System.out.println("===================================");
		i1.printInfo();
		i2.printInfo();
		i3.printInfo();
		System.out.println("수정1차");
		System.out.println("수정2");
		
		
	}

}
