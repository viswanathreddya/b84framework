package practies;

public class ReversemultipleString {
	public static void main(String[] args) {
		String name="Ankanna gari Viswanath";  //o/p: htanawsiV annaknA irag
		String rev= "";
		for(int i=name.length()-1; i>=0; i--)
		{
			rev =rev+name.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}
