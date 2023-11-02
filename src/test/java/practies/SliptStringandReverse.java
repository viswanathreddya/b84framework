package practies;

public class SliptStringandReverse {
	public static void main(String[] args) {
		//virtusa
	      String s = "ankanna gari viswanath";
	      String rev="";
			// Reverse the entire string
	      for(int i=s.length()-1;i>=0;i--)
	      {
	    	  rev=rev+s.charAt(i);
	      }
	      System.out.println(rev);
			// Split the string into words
				String[] words = rev.split(" ");

				// Store the word at index 1
				String temp = words[1];

				// Shift the word at index 2 to index 1
				words[1] = words[0];

				// Shift the stored word to index 0
				words[0] = temp;
					
			
				for(String word:words)
				{
					System.out.println(word);
				}


	
	}
}
