package practies;

import java.util.Arrays;

public class ReverseStringUsingSplit {
    public static void main(String[] args) {
    	
        String input = "Anakanna gari Viswanath";
        String output="htanawsiV annakanA irag";
        
        String[] words=input.split(" ");
        
        int mid=(words.length +1)/2;
        
        String return1="";
        
      for(int i=words.length-1;i>=0;i--) {
    	 
    	  if(mid==i) {
    		  continue;
    	  }
    	  
    	  String word=words[i];
    	char[] chrs=  word.toCharArray();
    	  int left=1;
    	  int right=chrs.length;
    	  char prev;
    	 while(left<right) {
    		
    		 chrs[left]=chrs[right];
    	 }
    	 return1=String.join(return1, words);
      }
    }
}