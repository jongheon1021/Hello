
public class PizzaMain {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		
		p1.setType("���۽�����");
		p1.setSize(12);
		
		Pizza p2 = new Pizza("��������");
		p2.setSize(24);
		
		Pizza p3 = new Pizza("�Ұ��",12);
		
		p1.toPrint();
		p2.toPrint();
		p3.toPrint();
	}

}

