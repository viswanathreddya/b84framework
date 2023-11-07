package practies;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ReverseaWordinString {
	public static void main(String[] args) {
		String word1="My name is Viswa";
		String[] words= {"My","name","is","Viswa"};
		String[] sw = word1.split(" ");
		System.out.println(sw.length);
		
		for(String word:words)
		{
			for(int i=word.length()-1; i>=0;i--)
			{	
				System.out.print(word.charAt(i));		
									
			}System.out.print(" ");
		}
		
		
	}

}
