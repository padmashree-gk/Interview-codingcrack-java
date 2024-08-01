package strings;

public class ReverseSentence {
	public static void main(String[] args) 
	{
		String str="Hello, my name is padmashree";
		String[]array=str.split(" ");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+ " ");
		}
		
	}

}
