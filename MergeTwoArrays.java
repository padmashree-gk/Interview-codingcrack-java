package Numbers;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int arr1[]= {1,2,4,5,6};
		int arr2[]= {7,8,9};
		int merge[]=new int[arr1.length+arr2.length];
		int x=0;
		for(int i=0;i<arr1.length;i++) {
			merge[x++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			merge[x++]=arr2[i];
		}
		System.out.println(Arrays.toString(merge));
	}

}
