package Numbers;

public class HappyNumber {
	public static void main(String[] args) {
		int num=78;
		while(num>9) {
			int sum=0;
			do {
				int rem=num%10;
				sum=sum+rem*rem;
				num=num/10;
			}
			while(num!=0);
				num=sum;
		}
		if(num==1 || num==7) {
			System.out.println("Happy number");
		}else {
			System.err.println("Not a Happy number");
		}
	}

}
