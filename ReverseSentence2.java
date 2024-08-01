package strings;

public class ReverseSentence2 {
	public static void main(String[] args) {
		String str="hello my name is vidhyashree";
		String word="";
		String reverse="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ') 
			{
				word=word+ch;
				
			}else {
//				reverse=word+" "+reverse;
				reverse=reverse+" "+word;
				word="";
			}
		}
//		reverse=word+" "+reverse;
		reverse=reverse+" "+word;
		System.out.println(reverse+ " ");
	}

}
