import java.util.Scanner;

public class Day04_사칙연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 50;
		char op = '+';
		String opp;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("A:");		a = sc.nextInt();
			System.out.print("B:");		b = sc.nextInt();

			System.out.print("연산자");		opp = sc.next();

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
				System.out.println("사칙연산자가 아닙니다.");
			switch (op) {
			case '+':
			case '-':
				System.out.println("가감연산");	break;
			case '*':
			case '/':
				System.out.println("승제연산");	break;
			
				
			}
		}
	}
}
