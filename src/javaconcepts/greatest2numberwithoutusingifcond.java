package javaconcepts;

public class greatest2numberwithoutusingifcond {


	public static void main(String[] args) {
		int a=10;
		int b=20;

		int c=Math.max(a, b);
		System.out.println("The greatest number is:"+c);

		if(a>b) {
			System.out.println("a is greatest");
		}
		else {
			System.out.println("b is greatest:"+20);
		}


	}

}
