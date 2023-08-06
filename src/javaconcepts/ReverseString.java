package javaconcepts;

public class ReverseString {
// how to reverse string-- so we have two method normal and by using string buffer
	public static void main(String[] args) {
		
		buffer();
		 String name = "vallarasan";
		String rev ="";
		int lenth = name.length();
		for( int i=lenth-1;i>=0;i--) {
		rev=rev+name.charAt(i);
		
	}
		System.out.println(rev);
}
	
	public  static void buffer() {
		String n = "vallarasan";
			StringBuffer bf= new StringBuffer(n);
			System.out.println(bf.reverse());
		}
	
		
		
	}
