package strings;

public class StringPalindrome {
	public static void main(String[] args)
	{
		String str="padmasheee";
		String copy=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(copy.equals(rev)) 
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
