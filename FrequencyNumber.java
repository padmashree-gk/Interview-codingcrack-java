package Numbers;

import java.util.HashMap;

public class FrequencyNumber {
	public static void main(String[] args) {
		HashMap<Integer, Integer>map=new HashMap<>();
		int arr[]= {3,2,1,9,10,50,60,9,12,66,99,999,99,3,1,1,1,1};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])) {
				int count=map.get(arr[i]);
				count=count+1;
				map.put(arr[i], count);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println();
		System.out.println(map);
		int highest=0;
		int key1=0;
		for(int key:map.keySet())
		{
			int value=map.get(key);
//			System.out.println(map.get(key));
			if(value>highest) {
				highest=value;
				key1=key;
			}
		}
		System.out.println(key1+"=>"+highest);
		
	}

}
