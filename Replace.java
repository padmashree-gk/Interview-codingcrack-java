package Numbers;

import java.util.Arrays;

public class Replace {
	public static void main(String[] args) {
		char[]str="padmashree".toCharArray();
		char replacechar='&';
		StringBuilder build=new StringBuilder();
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			for(int j=0;j<str.length;j++)
			{
				if(str[i]==str[j])
					count++;
			}
			if(count >=2) {
				build.append(replacechar);
			}else {
				build.append(str[i]);
			}
		}
		System.out.println(build);
		
	}

}
