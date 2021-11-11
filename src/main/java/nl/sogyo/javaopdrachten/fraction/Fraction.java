public class Fraction {
	
	int numerator = 0;
	int denominator = 0;
	int gcd = 1;
	int num = 0;
	int den = 0;
	
	
	double toDecimalNotation(){
		double frac = ((double) numerator) / ((double)denominator);
		return frac;
	}
	
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	int greatestCommonDivisor(int numerator, int denominator) {
    int greatestCommonDivisor = 1;
		for (int i = 1; i <= numerator && i <= denominator; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				greatestCommonDivisor = i;
			}
		}
    return greatestCommonDivisor;
	}
	//de Grootste Gemene Deler is het grootste getal waardoor allebei de getallen gedeeld kunnen worden. 
	//Perfect voor het versimpelen van breuken.
	
	
	Fraction add(int x){
		this.numerator = numerator + (denominator * x);
		Fraction newFraction = new Fraction(numerator, denominator);
		return newFraction;
	}
	
	Fraction add(Fraction fraction){
		num = fraction.numerator;
		den = fraction.denominator;
		num = num * denominator;
		numerator = numerator * den;
		denominator = denominator * den;
		numerator = numerator + num;
		gcd = greatestCommonDivisor(numerator, denominator);
		Fraction newFraction = new Fraction((numerator / gcd),(denominator / gcd));
		return newFraction;
	}
	
	Fraction subtract(int x){
		this.numerator = numerator - (denominator * x);
		Fraction newFraction = new Fraction(numerator, denominator);
		return newFraction;
	}
	
	Fraction subtract(Fraction fraction){
		num = fraction.numerator;
		den = fraction.denominator;
		num = num * denominator;
		numerator = numerator * den;
		denominator = denominator * den;
		numerator = numerator - num;
		gcd = greatestCommonDivisor(numerator, denominator);
		Fraction newFraction = new Fraction((numerator / gcd),(denominator / gcd));
		return newFraction;
	}
		
	Fraction multiply(int x){
		this.numerator = numerator * x;
		gcd = greatestCommonDivisor(numerator, denominator);
		Fraction newFraction = new Fraction((numerator / gcd), (denominator / gcd));
		return newFraction;
	}
	
	Fraction multiply(Fraction fraction){
		num = fraction.numerator;
		den = fraction.denominator;
		numerator = numerator * num;
		denominator = denominator * den;
		gcd = greatestCommonDivisor(numerator, denominator);
		Fraction newFraction = new Fraction((numerator / gcd),(denominator / gcd));
		return newFraction;
	}
	
	Fraction divide(int x){
		this.denominator = denominator * x;
		gcd = greatestCommonDivisor(numerator, denominator);
		Fraction newFraction = new Fraction((numerator / gcd), (denominator / gcd));
		return newFraction;
	}
	
	Fraction divide(Fraction fraction){
		den = fraction.numerator;
		num = fraction.denominator;
		// Want delen met een breuk is hetzelfde als vermenigvuldigen met het omgekeerde.
		numerator = numerator * num;
		denominator = denominator * den;
		gcd = greatestCommonDivisor(numerator, denominator);
		Fraction newFraction = new Fraction((numerator / gcd),(denominator / gcd));
		return newFraction;
	}
		
	public String toString(){
		String string = (numerator + "/" + denominator);
		return string;
	}
	
	public static void main (String[] args)  {
		Fraction oneThird = new Fraction(1, 3);
		Fraction oneThirdTwo = new Fraction(1, 3);
		Fraction oneSixth = new Fraction(1, 6);
		Fraction threeFourth = new Fraction(3, 4);
		Fraction threeFourthTwo = new Fraction(3, 4);
		Fraction twoFifth = new Fraction(2, 5);
		System.out.println(oneThird.toDecimalNotation());
		System.out.println(oneThird.toString());
		System.out.println(oneThird.add(1));
		System.out.println(oneThirdTwo.add(oneSixth));
		System.out.println(oneThird.subtract(1));
		System.out.println(oneThirdTwo.subtract(oneSixth));
		System.out.println(threeFourth.multiply(2));
		System.out.println(threeFourthTwo.multiply(twoFifth));
		System.out.println(threeFourth.divide(2));
		System.out.println(threeFourthTwo.divide(twoFifth));
	}
}