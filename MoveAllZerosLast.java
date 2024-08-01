package Numbers;

import java.util.Arrays;

public class MoveAllZerosLast {
	public static void main(String[] args) {
		int arr[]= {0,2,3,0,0,9,0,4,5,6};
		int arr2[]=new int[arr.length];
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0) {
				arr2[x++]=arr[i];
			}
			
		}
		while(x<arr.length) {
			arr2[x++]=0;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
