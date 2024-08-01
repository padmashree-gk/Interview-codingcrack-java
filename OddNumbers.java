package Numbers;

public class OddNumbers {
	public static void main(String[] args) {
		int []arr= {10,30,40,45,67};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println("Odd Numbers are"+"=>"+arr[i]);
			}
		}
	}

}
