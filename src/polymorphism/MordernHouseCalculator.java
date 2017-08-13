package polymorphism;

public class MordernHouseCalculator extends HouseCalculator{
	
	HouseCalculator House = new HouseCalculator();
	
	public int areaOfHouse(int a, int b, int c) {
		int total = a + b + c + 5;
		return total;
	}
}