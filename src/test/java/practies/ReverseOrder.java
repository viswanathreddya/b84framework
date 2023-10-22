package practies;

public class ReverseOrder {
	public static void main(String[] args) {
		String name="abccba2";
		String reverse="";
		char ch = 0;
		for (int i=name.length()-1;i>=0;i--)
		{
			  ch = name.charAt(i);
			 reverse=reverse+ch;
		}
		if(reverse.equals(name))
		{
			System.out.println("Polindrome");
		}
		else {
			System.out.println("Not a Polindrome");
		}
	}

}
