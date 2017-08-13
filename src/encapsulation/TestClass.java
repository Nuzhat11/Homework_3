package encapsulation;

public class TestClass {

	public static void main(String[] args) {
		Class st1 = new Class();
		st1.setStID(1234);
		st1.setFirstClass("Math");
		st1.setSecondClass("English");
		st1.setThirdClass("WebScript");
		st1.setForthClass("Databases");
		st1.setFifthClass("Art");
		
		System.out.println(st1.getFirstClass()+ " " + st1.getSecondClass()+ " " + st1.getThirdClass()+ " " + st1.getForthClass()+ " " + st1.getFifthClass());
}
}