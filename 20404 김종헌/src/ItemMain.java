
public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "에 오신것을 환영합니다.");
		System.out.println("현재 상품 종류 개수 :" + Item.getItemCnt()		);
		System.out.println("============================================");
		
		Item Item1 = new Item();
		Item1.setNo(100);
		Item1.setName("연필");
		Item1.setPrice(600);
		Item1.setCount(5);
		
		Item Item2 = new Item(101,"노트");
		Item2.setPrice(1000);
		Item2.setCount(4);
		
		Item Item3 = new Item(102 ,"지우개",500,5);
		Item1.printInfo();
		Item2.printInfo();
		Item3.printInfo();
		
		System.out.println("==================================");
		System.out.println("현재 상품 종류 개수:" + Item.getItemCnt());
		System.out.println("==================================");
		Item1.instore(10);
		Item2.instore(20);
		Item2.outstore(5);
		Item3.instore(20);
		Item3.outstore(100);
		Item1.printInfo();
		Item2.printInfo();
		Item3.printInfo();
		
	}

}
