import java.util.Scanner;

public class Day03_������ {

	public static void main(String[] args) {
		int a,b;
		a = 1;
		b = 2;
		System.out.println(a!= b);
		
		//���ڸ� �Է¹ް� Ȧ¦�� �����Ͽ� ���
		//3�� Ȧ��
		//4�� ¦��

		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("�����Է�:");
			int num = sc.nextInt();
			if(num % 2 == 0)
			{
				System.out.println(num+ ":¦��");
				
			}
			else {
				
					System.out.println(num+ ":Ȧ��");
				
			}
			
		}
		
	}
}
