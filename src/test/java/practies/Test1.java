package practies;

public class Test1 {
	public static void main(String[] args) {

		String str = "testing94test23test";
		String names = "";
		String numbers = "";

		for (int i = 0; i < str.length(); i++) {
			char bit = str.charAt(i);
			if (bit >= 'a' && bit <= 'z') {
				names = names + bit;
			} else if (bit >= '0' && bit <= '9') {
				numbers = numbers + bit;
			}
		}
		System.out.println(names);
		System.out.println(numbers);
	}

}
