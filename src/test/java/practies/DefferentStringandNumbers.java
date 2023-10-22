package practies;

public class DefferentStringandNumbers {
	public static void main(String[] args) {
		String word="Viswa123Virat123A1B2";
		//String word = words.toLowerCase();
		String name="";
		String num="";
		for(int i=0; i<word.length()-1;i++)
		{
			char bit = word.charAt(i);
			if((bit>='a' && bit<='z')|| (bit>='A' && bit<='Z')){
				name=name+bit;
			}
			else {
				num=num+bit;
			}
		}System.out.println(name);
		System.out.println(num);
	}

}
