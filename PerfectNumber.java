package Numbers;

public class PerfectNumber {
	public static void main(String[] args) {
		int num=6;
		int copy=num;
		int sum=0;
		for(int i=1;i<=num/2;i++) 
		{
			sum=sum+i;
		}
		System.out.println(sum);
		if(sum==copy) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not A perfect number");
		}
	}

}
