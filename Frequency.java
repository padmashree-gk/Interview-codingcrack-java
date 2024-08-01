package strings;

import java.util.TreeMap;

public class Frequency {
	public static void main(String[] args) {
		String str="aaabbc";
		int count=0;
		TreeMap<Character, Integer>map=new TreeMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				 count=map.get(ch);
				 count=count+1;
				 map.put(ch, count);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for(char key:map.keySet()) {
			System.out.print(map.get(key)+""+key);
		}
	}

}
