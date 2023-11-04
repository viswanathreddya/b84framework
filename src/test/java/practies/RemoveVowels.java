package practies;

import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = sc.nextLine();
		String remove="";
		String empty = "";
		for (int i=0; i<name.length();i++)
		{
			char check = name.charAt(i);
			if(check=='a' || check=='e' || check=='i' || check=='o' || check=='u')
			{
				remove=remove+check;
			}
			else
			{
				empty=empty+check;
			}
		}System.out.println(empty);
		
	}	

}
