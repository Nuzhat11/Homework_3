package polymorphism;

public class TestHouseCalculator {

	public static void main(String[] args) {
		
		HouseCalculator calculate = new HouseCalculator();
		int sizeOfRectangle = calculate.areaOfHouse(10, 20);
			System.out.println(sizeOfRectangle);
		int sizeOfSquare = calculate.areaOfHouse(10, 20, 30);
			System.out.println(sizeOfSquare);
				
		MordernHouseCalculator mhc = new MordernHouseCalculator();
		int MordernHouseSquare = mhc.areaOfHouse(10, 20, 30);
			System.out.println(sizeOfSquare);
	} 
}