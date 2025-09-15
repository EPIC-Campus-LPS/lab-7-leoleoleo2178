package packagename;

public class fraction {
	private int num;
	private int den;
	
	public fraction() {
		num = 0;
		den = 1;
	}
	
	public fraction(int n) {
		num = n;
		den = 1;
	}
	
	public fraction(int n, int d) {
		num = n;
		den = d;
	}
	
	public double toDecimal() {
		return ((double) num) / den;
	}
	
	public fraction simplify() {
	    int gcd = Math.abs(den);    // Ensure an absolute value
	    int temp = num % gcd;
	    int temp2 = num;
	    while (temp > 0) {
	        temp2 = gcd;
	        gcd = temp;
	        temp = temp2 % gcd;
	    }
	    fraction t = new fraction(num/gcd, den/gcd);
	    return t;
	}
	
	public boolean equals(fraction f2) {
		fraction f = new fraction(num,den);
		if (f.toDecimal() == f2.toDecimal()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return num + "/" + den;
	}
	
}
