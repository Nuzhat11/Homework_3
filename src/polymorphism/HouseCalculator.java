package polymorphism;

public class HouseCalculator {

	public int areaOfHouse(int a, int b) {
		int total = a + b;
		return total;
}

	public int areaOfHouse(int a, String name) {
		int total = a ;
		return total;
	}
	
	public int areaOfHouse(int a, int b, int c) {
		int total = a + b + c;
		return total;
	}
}