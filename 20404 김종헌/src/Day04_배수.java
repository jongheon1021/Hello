import java.util.Scanner;

public class Day04_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�����Է�:");
			a = sc.nextInt();
			System.out.println("���:");
			b = sc.nextInt();
			switch (a % b) {
			case 0: {
				System.out.println(a + "��(��)" + b +"�� ��� �Դϴ�.");
				break;
			}
			default: {
				System.out.println(a + "��(��)" + b +"�� ����� �ƴմϴ�");
				break;
			}
			}
		}

	}

}
