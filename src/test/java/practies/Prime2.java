package practies;

public class Prime2 {
	public static void main(String[] args) {
		int num=4;
		int div = 0;
		int flag=0;
		if(num==0 || num==1)
		{
			System.out.println("Not a prime number");
		}
		else {
			for(int i=2; i<num; i++)
			{
				div=num%i;
				if(div==0)
				{
					System.out.println("Not a Prime");
					flag=1;
					break;
				}
			}if(flag==0)
			{
				System.out.println("Prime");
			}
			
		}
	}

}
