package javaconcepts;

public class FactorialsOfGivenNumber {

	public static void main(String[] args) {
		/* factorials of given number */

		int number = 5;
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("the factorial of given number:" + factorial);
	}

}
/*
 * //factorial 1*1=1..1*2=2..2*3=6..6*4=24..24*5=120
 * //24=24*5 120=120*5
 * 
 * formula n × (n – 1) × (n – 2) × … × 1 = n × (n – 1)
 * 
 * 
 * what is factorial number
 * the product of all positive integers less than or equal to
  a given positive integer and denoted by that integer and an exclamation point
 */