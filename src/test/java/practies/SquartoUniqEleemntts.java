package practies;

import java.util.HashSet;

public class SquartoUniqEleemntts {
	public static void main(String[] args) {
		int[] num= {2,4,1,5,6,2,3};
		HashSet<Integer> hs= new HashSet<>();
	
		for(int single:num)
		{
			hs.add(single);
		}
		for(int uniq:hs)
		{
			int squar= uniq*uniq;
			System.out.println(squar);
		}
	}

}
