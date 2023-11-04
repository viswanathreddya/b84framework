package practies;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter in between 1 to 9");
		int a = sc.nextInt();
		if(a>=1 && a<=9)
		{
			for(int i=1; i<=a; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}
		else {
			System.out.println("invalid");
		}
		sc.close();
	}

}
