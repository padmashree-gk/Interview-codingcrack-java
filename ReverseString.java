package strings;

import java.util.Scanner;

public class ReverseString
{
	


	public static void main(String [] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value to Reverse the string");
		
		String str=sc.nextLine();
				
		 System.out.println(reverse(str));
	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		 return rev; 
	}

}
