package javaconcepts;

public class FactorsOfGivenNumber {
																				
	public static void main(String[] args) {
		System.out.println("Factors are:");
	int number=100;
	for(int i=1;i<=number;i++)
	{
     if(number%i==0) {	
			System.out.println(i);
		}
	}
	}
}
//1*100=100
//2*50 =100
//4*25 =100
//5*20 =100
//10*10=100
//20*5 =100
//25*4 =100
/*
 * what is factors?
 * 
 * Factors of a number are defined as numbers that divide the original number evenly or exactly.
 */