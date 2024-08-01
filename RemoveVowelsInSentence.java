package strings;

public class RemoveVowelsInSentence {
	public static void main(String[] args) {
		String str="my name is padmashree".toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch !='a' && ch !='e' && ch !='i' && ch !='o' && ch!='u') {
				System.out.print(ch);
			}
		}
	}

}
