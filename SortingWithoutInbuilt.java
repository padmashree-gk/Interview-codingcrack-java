package Numbers;

import java.util.Arrays;

public class SortingWithoutInbuilt {
	public static void main(String[] args) {
		int arr[]= {3,2,1,9,10,50,60,9,12,66};
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
