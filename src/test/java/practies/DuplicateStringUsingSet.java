package practies;

import java.util.HashSet;

public class DuplicateStringUsingSet {
	public static void main(String[] args) {
		String name1="Anakkana Gari Viswanath";
		String name=name1.toLowerCase();
		char[] namearray = name.toCharArray();
		HashSet<Character> uniqName= new HashSet<>();
		for(char uniq:namearray)
		{
			uniqName.add(uniq);
		}
		for(char finall:uniqName)
		{
			System.out.print(finall);
		}
	}

}
