package ���࿬��;

public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "�� ���Ű� ȯ���մϴ�");
		System.out.println("���� ��ǰ ���� ����:" + Item.getItemCnt());
		System.out.println("===================================");
		
		Item i1 = new Item();
		i1.setNo(101);
		i1.setName("����");
		i1.setPrice(1000);
		i1.setCount(100);
		Item i2 = new Item(102,"��Ʈ");
		i2.setPrice(1000);
		i2.setCount(100);
		Item i3 = new Item(103,"���찳",1000,100);
		i1.printInfo();
		i2.printInfo();
		i3.printInfo();
		System.out.println("===================================");
		System.out.println("���� ��ǰ ���� ����:" + Item.getItemCnt());
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
		System.out.println("����1��");
		System.out.println("����2");
		
		
	}

}
