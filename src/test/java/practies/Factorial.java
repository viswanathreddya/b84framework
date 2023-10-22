package practies;

public class Factorial {
	public static void main(String[] args) {
		int num=4;
		
		int sum=0;
		for(int i=num; i>=1;i--)
		{
			int rem = num%10;
			int fact=1;
			for(int j=rem; j>=1;j--)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			num = num/10;
		}System.out.println(sum);
	}

}
