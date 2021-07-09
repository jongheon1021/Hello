
public class Truck2 extends Cars{

	void speedUP() {
		velocity += 5;
		System.out.println(name + "현재 속력" + velocity);
	}
	
	public static void main(String[] args) {
		Truck2 Bonggo = new Truck2();
		Bonggo.speedUp();
		Bonggo.speedUp();
		Bonggo.speedUp();
		
	}

}
