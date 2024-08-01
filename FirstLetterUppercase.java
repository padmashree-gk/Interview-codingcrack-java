package strings;

public class FirstLetterUppercase {
	public static void main(String[] args) {
		String str="my name is padmashree".toLowerCase();
		String s=" "+str;
		String fina="";
		for(int i=0;i<str.length();i++) 
		{
			char ch=s.charAt(i);
			if(ch == ' ') {
				fina=fina+ch;
				i++;
				ch=s.charAt(i);
				fina=fina+Character.toUpperCase(ch);
			}else {
				fina=fina+ch;
			}
		}
		System.out.println(fina);
		
	}

}
