package abstraction;

public class Phone extends Telephone implements CellPhone {
	
	public void productShape() {
		System.out.println("The phone is 4 in. long");
	}
	
	public void on() {
		System.out.println("The phone should have a turn on button");
	}
	
	public void off() {
		System.out.println("The phone should have an off button");
		}
	public void SmartPhone() {
		System.out.println();
	}
}