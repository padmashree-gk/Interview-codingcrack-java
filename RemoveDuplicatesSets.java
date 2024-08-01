package strings;

import java.util.HashSet;

public class RemoveDuplicatesSets {
	public static void main(String[] args)
	{
		
		String str="padmashree";
		HashSet<Character> set=new HashSet<>();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				count=count+1;
				System.out.print(ch);	
			}
		}
		
	}

}
