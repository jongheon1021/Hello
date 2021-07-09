import java.util.Scanner;

public class aaaaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			int sum  = 0;
			System.out.print("1-2+3-4+5-6+7-8+9-10=");
			for(int i = 1; i<=10; i++)
				if(i%2 == 0) sum -= i;
				else sum += i;
			System.out.print(sum);
			for(int i = 1; i<=5; i++) {
				for(int j = 1; j<=5; j++)
					System.out.print(j + "\t");
				System.out.print("\n");
			}
			*/
			for(int i = 1; i<=5; i++) {
				for(int j = 1; j<=5; j++)
					System.out.print(j+"\t");
				System.out.print("\n");
			}
			for(int i = 3; i>=1; i--)
			{
				for(int j = 1; j<=i; j++)
				System.out.print("*"+"\t");
				System.out.print("\n");
			}
			/*
			int i = 1, sum = 0;
			System.out.print("1-2+3-4+5-6+7-8+9-10=");
			while(i <= 10) {
				if(i%2==0) sum -= i;
				else sum += i;
				i++;
			}
			System.out.print(sum);
			for(int i = 1; i<=10; i++) {
				System.out.print(i+"\t");
				if(i == 5) break;
			}
			for(int i = 1; i<=10; i++) {
				if(i == 5) continue;
				System.out.print(i + "\t");
			}
		int score[] = new int[5];
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5; i++)
		{
			System.out.print("성적입력:");
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}
		System.out.println("합계:" + sum);
		avg = sum/5.0;
		System.out.printf("평균: %.1f ",avg);*/
	}

}
