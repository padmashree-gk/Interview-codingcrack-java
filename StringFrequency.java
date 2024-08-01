package strings;

import java.util.HashMap;
import java.util.TreeMap;

public class StringFrequency {
	public static void main(String[] args) {
		TreeMap<Character, Integer>map=new TreeMap<>();
		String str="padmashreee";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count=count+1;
				map.put(ch, count);
			}else {
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);
		int highest=0;
		int second=0;
		char Secondchar=' ';
		char firstchar=' ';
		for(char key:map.keySet()) 
		{
			int value=map.get(key);
			System.out.println(map.get(key));
			if(value>highest)
			{
				highest=value;
				firstchar=key;
				Secondchar=firstchar;
			}
			
			if(value<highest && value>second) {
				second=value;
				Secondchar=key;
			}
			
		}
			
		System.out.println(firstchar+"=>"+highest);
		System.out.println(Secondchar+"=>"+ second);
		
	

}
}