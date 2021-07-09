
public class Day_매개변수1 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		int a,b;
		a = Integer.parseInt(args[0]); //문자열을 숫자로 변환하는 방법
		b = Integer.parseInt(args[1]);
		System.out.println("문자열:" + args[0] + args[1]);
		System.out.println("숫자:"+(a+b)	);
		
		

	}

}
