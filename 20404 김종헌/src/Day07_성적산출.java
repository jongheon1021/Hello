import java.util.Scanner;

public class Day07_�������� {

	public static void main(String[] args) {
		// 5�� �л����� �������Է� �޾Ƽ� �迭�� �����ϰ�,
		// �հ�� ����� ����Ͽ� ����ϴ� ���α׷��� �ۼ��غ���
		int score[] = new int [5];
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5; i++)
		{
			System.out.print("���� �Է�: ");
			score[i] = sc.nextInt();
			sum = sum + score[i];//sum += score[i];
		}
		System.out.println("�հ�:"+sum);
		//avg = sum/5.0;
		avg = (double)sum/5;
		System.out.printf("���: %.1f", +avg);
	}

}
