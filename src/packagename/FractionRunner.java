package packagename;

public class FractionRunner {

	public static void main(String[] args){
		fraction f = new fraction(10,400);
		
		System.out.println(f); // 10/400
		
		double d = f.toDecimal();
		System.out.println(d); // 0.025
		
		fraction f2 = f.simplify();
		System.out.println(f2); // 1/40
		
		System.out.println(f.equals(f2)); // True
		
	}
}
