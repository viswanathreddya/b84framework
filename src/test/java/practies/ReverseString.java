package practies;

public class ReverseString {
	public static void main(String[] args) {
		String name="Viswa Virat";
		int l = name.length();
		for (int i=l-1;i>=0;i--)
		{
			char r = name.charAt(i);
			System.out.print(r);
		}
	}

}
