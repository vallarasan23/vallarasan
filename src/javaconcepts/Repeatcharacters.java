package javaconcepts;

public class Repeatcharacters {
	public static void main (String [] args)
	{
	String sentence ="vallarasan";
	String cher="";
	String duplicate="";
	
	for(int i=0;i<sentence.length();i++) {
		String repeat=Character.toString(sentence.charAt(i));
		if(cher.contains(repeat)) {
			if(duplicate.contains(repeat)) {
		}
	}duplicate+=repeat+"";
	cher+=repeat+"";
	
}System.out.println(duplicate);
}}