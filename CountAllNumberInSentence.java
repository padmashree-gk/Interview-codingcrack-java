package strings;

public class CountAllNumberInSentence {
	public static void main(String[] args) {
	String str= "my name is padmashree1234";
	int sum=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='0' &&  ch<='9')
		{
			sum=sum+(ch-48);
		}
	}
	System.out.println(sum);

}
}