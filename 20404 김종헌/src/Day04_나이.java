import java.util.Scanner;

public class Day04_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, code;

		Scanner sc = new Scanner(System.in);

		System.out.println("����⵵");
		year = sc.nextInt();
		System.out.println("�����ڵ�");
		code = sc.nextInt();

		
		System.out.println("����� ���̴� " + (2021 - year +1 )+ "�̰�");
		
		
		if (code == 1 || code == 3)
			System.out.println("�����Դϴ�");
		else if (code == 2 || code == 4)
			System.out.println("�����Դϴ�");
		else
			System.out.println("�ܰ���");

	}

}
