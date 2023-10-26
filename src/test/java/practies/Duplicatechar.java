package practies;

public class Duplicatechar {

    public static void main(String[] args) {
        String input = "Viswananth";
        char[] characters = input.toCharArray();
       // System.out.print("Duplicate characters in the string \"" + input + "\": ");
        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[j] == currentChar) {
                    System.out.print(currentChar + " ");
                    break;  // To avoid counting the same character multiple times
                }
            }
        }
    }
}



class A{
	public void m1() {
		String s1="Viswanath";
		char[] chars = s1.toCharArray();
	
		for(int i=0; i<=chars.length-1;i++)
		{
			char currentchar=chars[i];
			for(int j=i+1; j<=chars.length-1;j++)
			{
				if(chars[j]==currentchar) {
					System.out.println("Duplicateno:"+currentchar) ;
				}
			}
		}
	}
}