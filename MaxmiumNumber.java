package Numbers;

public class MaxmiumNumber
{
	public static void main(String[] args)
	{
		int arr[]= {20,10,30,4,6,8};
		int max=arr[0];
		int secondmax=arr[0];
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<max && arr[i]>secondmax) {
				secondmax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondmax);
	}

}
