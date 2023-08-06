package javaconcepts;

public class SumOfEvenNumberGivenRange {

	public static void main(String[] args) {
// sum of even number ranging from 1 to 250	
		int sNumber=1;
		int eNumber=250;
		int sum =0;
		for(int i=sNumber;i<=eNumber;i++)
		{
			if(i%2==0) 
				sum=sum+i;
		}
		System.out.println(sum);
	}

}
/*how to calculate b/w range of 1 to 10
 * //2+4+6+8+10=30
 * 
 * sum of even numbers are there between 1 and 100? and these are even number
   b/w 1 to 100. The list of even numbers from 1-100 is as follows: 2, 4, 6, 8,
   10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46,
   48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70,72, 74, 76, 78, 80, 82, 84,
   86, 88, 90, 92, 94, 96, 98, 100.
 */