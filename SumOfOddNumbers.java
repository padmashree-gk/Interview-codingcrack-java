package Numbers;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		int sum=0;
		int [] arr= {12,23,4,5,78,89,10};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) 
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
	}

}
