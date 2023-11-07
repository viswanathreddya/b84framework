package practies;

import java.util.HashSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class CommonNumbersinTwoArray {
	public static void main(String[] args) {
		int[] array1= {2,4,6,8,1,3,4,2};
		int[] array2= {1,2,3,4,5,6,7,2};
		
		HashSet<Integer> hs=new HashSet<>();
		int common=0;
		
		for(int element1:array1)
		{
			for(int element2:array2)
			{
				if(element1==element2)
				{
					hs.add(element1);
				}
			}
		}
		for(int uniq:hs)
		{
			System.out.println(uniq);
		}
	}

}
