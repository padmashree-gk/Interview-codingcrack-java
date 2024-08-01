package Numbers;

public class MinimumNumber {
	public static void main(String[] args) 
	{
		int arr[]= {20,30,50,60,70,5};
		int min=arr[0];
		int secondmin=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min) 
			{
				min=arr[i];
			}
			if(arr[i]>min && arr[i]<secondmin) {
				secondmin=arr[i];
			}
		}
		
		System.out.println(min);
		System.out.println(secondmin);
		
	}

}
