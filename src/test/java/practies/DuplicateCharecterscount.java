package practies;

public class DuplicateCharecterscount {
	public static void main(String[] args) {
		String name="ViswanathReddy Ravi";
		name=name.toLowerCase();
		name=name.replace(" ", "");
		char[] ch = name.toCharArray();
		
		String duplicate="";
		String constant="";
		for(int i=0; i<ch.length; i++)
		{
			char currentcar = ch[i];
			
			for(int j=i+1; j<ch.length;j++)
			{
				if(ch[j]==currentcar)
				{	
					
					duplicate=duplicate+currentcar;
					break;
					
				}
				else {
					constant=constant+currentcar;
					break;
				}
			}		
			
		}
		System.out.println(constant);
		
	}
	
}
