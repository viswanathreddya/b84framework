package practies;

public class AddIntegers {
	public static void main(String[] args) {
		int[] a= {2,5,1,3,4,6};
		int sum=0;
		for(int single:a)
		{
			if(single%2==0)
			{
				sum=sum+single;
			}
		}
		System.out.println(sum);
	}

}
