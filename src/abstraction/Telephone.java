package abstraction;

public abstract class Telephone {
	
	public void hardware () {
		System.out.println("let's implement the hardware");
	}
	public void screen() {
		System.out.println("It is not touch-screen");
	}
	public abstract void SmartPhone ();
	
}