package Numbers;

public class StrongNumber {
	public static void main(String[] args)
	{
		int number=146;
		int sum=0;
		int copy=number;
		while(number!=0)
		{
			int rem=number%10;
			int number2=rem;
			int fact=1;
			for(int i=number2;i>=1;i--) {
			fact=fact*i;	
			}
			sum=sum+fact;
			number=number/10;
			
		}
		System.out.println(sum);
		if(sum==copy) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong number");
		}
	}

}
