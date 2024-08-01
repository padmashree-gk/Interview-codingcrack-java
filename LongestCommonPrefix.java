package strings;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String [] array= {"flower","flow","floor"};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		String str1=array[0];
		String str2=array[array.length-1];
		for(int i=0;i<array.length;i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				System.out.print(str1.charAt(i));
			}
		}
	}
}
