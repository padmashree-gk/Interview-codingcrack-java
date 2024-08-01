package Numbers;

import java.util.Scanner;

public class HCFProgram {
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number 1");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		System.out.println("Enter the value of b");
		int num2=sc.nextInt();
		
		int smaller=(num1<num2)?num1:num2;
		int hcf=1;
		
		for(int i=1;i<=smaller;i++) {
			if(num1%i==0 && num2%i==0) {
				hcf=i;
			}
		}
		
		System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
	}

}
