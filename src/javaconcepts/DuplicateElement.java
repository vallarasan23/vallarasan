package javaconcepts;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) {
		int n[]= {1,2,3,2,5,2,6,7,7,7,7,8,8,9,9,};
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j]) {
					System.out.println(n[i]);
				}
			}
		}
		
		
		

		String names []={"valla","valla","mavis","java","mavis","java","selenium"};

		int l=names.length;

		for(int i = 0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(names[i].equals(names[j])) {

					System.out.println(names[i]);

				}

			}
		}
		Set<String> store=new HashSet<String>();

		for(String namelist:names) {
			if(store.add(namelist)==false){
				System.out.println(namelist);
			}
		}
	}}

//		

