import java.util.Scanner;

public class Day04_��Ģ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 50;
		char op = '+';
		String opp;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("A:");		a = sc.nextInt();
			System.out.print("B:");		b = sc.nextInt();

			System.out.print("������");		opp = sc.next();

			op = opp.charAt(0);
			if (op == '+')
				System.out.println(a + opp + b + "=" + (a + b));
			else if (opp.equals("-"))
				System.out.println(a + opp + b + "=" + (a - b));
			else if (opp.equals("*"))
				System.out.println(a + opp + b + "=" + (a * b));
			else if (opp.equals("/"))
				System.out.println(a + opp + b + "=" + (a / b));
			else
				System.out.println("��Ģ�����ڰ� �ƴմϴ�.");
			switch (op) {
			case '+':
			case '-':
				System.out.println("��������");	break;
			case '*':
			case '/':
				System.out.println("��������");	break;
			
				
			}
		}
	}
}
