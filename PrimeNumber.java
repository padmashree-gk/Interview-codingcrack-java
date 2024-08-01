package Numbers;

public class PrimeNumber {
	public static void main(String[] args) {
		int number=7;
		boolean flag=true;
		while(number!=0) 
		{
			if(number%2==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("prime number");
		}else {
			System.out.println("Not a Prime number");
		}
	}

}
