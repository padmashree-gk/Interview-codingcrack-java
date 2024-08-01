package strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="god";
		String str2="mad";
		if(str1.length() == str2.length()) 
		{
			char [] ch1=str1.toCharArray();
			char [] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++) 
			{
				if(ch1[i]==ch2[i]) {
					System.out.println("Anagram");
				}
				else {
					System.out.println("It is  not a anagaram");
				}
			}	
			
		}else 
		{
			System.out.println("Enter a valid String");
		}
	}

}
