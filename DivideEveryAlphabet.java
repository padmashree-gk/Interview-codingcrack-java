package strings;

public class DivideEveryAlphabet {
	public static void main(String[] args) {
		String str="my name 2233&&&my name is vidhy78##()";
		int AlphabetsSum=0;
		int NumberSum=0;
		int SpecialcharacterSum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				AlphabetsSum=AlphabetsSum+1;
				System.out.print("Only Alphates in the Sentence are"+"("+ch+")");
				
			}
			
			
			else if(ch>='0' && ch<='9') {
				NumberSum=NumberSum+1;
				System.out.print("Only Numbers in the Sentence are"+"=====>"+ch);
			
			}
			
			else {
				SpecialcharacterSum=SpecialcharacterSum+1;
				System.out.print("Only Special charcaters in the Sentence are"+"=====>"+ch);
			}
		}
		System.out.println();
		System.out.println(AlphabetsSum);
		System.out.println(NumberSum);
		System.out.println(SpecialcharacterSum);
	}

}
