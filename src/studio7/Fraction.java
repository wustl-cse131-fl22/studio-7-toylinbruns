package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		this.numerator=initNumerator;
		this.denominator= initDenominator;
	}
	
	public Fraction sum(Fraction worseFraction) {
		int gcd = this.denominator * worseFraction.denominator;
		int totalNumerator = (this.numerator*worseFraction.denominator)+worseFraction.numerator*this.denominator;
		Fraction newFraction = new Fraction(totalNumerator, gcd);
		return newFraction;
		
	}
	
	public Fraction product(Fraction worseFraction) {
		int gcd = this.denominator * worseFraction.denominator;
		int totalNumerator= this.numerator*worseFraction.numerator;
		Fraction newFraction = new Fraction(totalNumerator, gcd);
		return newFraction; 
	}
	
	public Fraction reciprocal() {
		int newDenominator = this.numerator;
		int newNumerator= this.denominator;
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction; 
	}
	
	public static int gcd(int p, int q) {
		if (p%q==0) {
			return q;
		}
		else {
			return gcd(q, p%q);
		}
	}
	
	public Fraction simplify() {
		int gcd = Fraction.gcd(this.numerator, this.denominator);
		int newNumerator= this.numerator/gcd;
		int newDenominator= this.denominator/gcd;
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction; 
	}

	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}
}
