package Numbers;

import java.util.Scanner;

public class LCMProgramm {

	public static void main(String[] args) {
		System.out.println("Enter the Number 1");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		System.out.println("Enter the value of b");
		int num2=sc.nextInt();
		
		// finding the larger number here
		int max=(num1>num2)?num1:num2;
		int lcm=1;
		for(int i=max;i<=num1*num2;i++) {
			if (i % num1 == 0 && i % num2 == 0)
	        {
	         lcm = i;
	         break;
	        }
	      }
	    System.out.println ("The LCM: " + lcm);
		}
	}


//for (int i = 1; i <= num1 || i <= num2; i++)
//{
//if (num1 % i == 0 && num2 % i == 0)
//  hcf = i;
//}
//
//// LCM formula
//int lcm = (num1 * num2) / hcf;
//System.out.println ("The LCM: " + lcm);