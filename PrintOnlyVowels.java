package strings;

public class PrintOnlyVowels {
	public static void main(String[] args) {
		System.out.println("PRINT ONLY OVEWLS");
		String str="my name is padmashree".toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch =='a' || ch =='e' || ch =='i' || ch =='o' ||ch=='u') {
				System.out.println("Index Number"+i+"=> "+ch);
			}
		}
	}

}
