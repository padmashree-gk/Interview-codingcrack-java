package Numbers;

public class NumberPalindrome {
	public static void main(String[] args) 
	{
		int number=1210;
		int copy=number;
		int rev=0;
		while(number!=0) 
		{
			int rem=number%10;
			rev=(rev*10)+rem;
			number=number/10;
			
		}
		if(copy == rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a apalindrome");
		}
		
	}

}
