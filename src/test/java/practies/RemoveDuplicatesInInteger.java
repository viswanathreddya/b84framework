package practies;

import java.util.HashSet;

public class RemoveDuplicatesInInteger {
	public static void main(String[] args) {
		int[] array= {2,3,1,4,1,5,2,5,6,2};
		HashSet<Integer> uniqnum= new HashSet<>();
		
		for(int single:array)
		{
			uniqnum.add(single);
		}
		for(int uniq:uniqnum)
		{
			System.out.print(uniq);
		}
		
		
		
		String[] names= {"a", "a", "v","b","a"};
		HashSet<String> uniqname= new HashSet<>();
		for(String name :names)
		{
			uniqname.add(name);
		}
		for(String uniq2 :uniqname)
		{
			System.out.print(uniq2);
		}
	}

}
