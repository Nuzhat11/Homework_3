package abstraction;

public class TestPhone {

	public static void main(String[] args) {
		
		CellPhone CellPhone = new Phone();
		CellPhone.on();
		CellPhone.off();
		
		Telephone Telephone = new Phone ();
		Telephone.hardware();
		
		Phone Samsung = new Phone();
				Samsung.productShape();
	}

}