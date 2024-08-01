package Numbers;

public class EvenNumbers {
	public static void main(String[] args) {
		int arr[]= {10,30,40,55,60,35};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even Numbers are"+" "+arr[i]);
			}
		}
		
	}

}
