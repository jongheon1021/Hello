
public class Day03_�迭 {

	public static void main(String[] args) {
		
		
		System.out.println("������ ���� ����");
		int [] a= new int[3];
		int [] b= new int[] {11,22,33};
		
		a = b;
		a[0] = 99;
		for(int i = 0; i< a.length; i++)
			System.out.println(a[i]);
		for(int i = 0; i< b.length; i++)
			System.out.println(b[i]);
		
	}

}
