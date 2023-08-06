package javaconcepts;

public class ReverseStringButExcludeInteger {

	public static void main(String[] args) {
		String s="app23452a";
		String rev="";
		int name=s.length();

		for(int i=name-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		String RO=	rev.replaceAll("[^a-z,A-Z]","");
		System.out.println(RO);
	}

}
