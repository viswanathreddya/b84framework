package practies;

public class CountofDuplicatesinString {
	public static void main(String[] args) {
        String str = "AABBCABCGG";
        countCharacters(str);
    }

    public static void countCharacters(String str) {
        char[] characters = str.toCharArray();
        int n = characters.length;

        for (int i = 0; i < n; i++) {
            char currentChar = characters[i];
            int count = 1;

            // Check if the current character is a letter (A-Z or a-z)
            if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                // Count the occurrences of the current character
                for (int j = i + 1; j < n; j++) {
                    if (currentChar == characters[j]) {
                        count++;
                    }
                }

                // Print the character and its count
                System.out.println(currentChar + ":" + count);

                // Set all occurrences of the character to '\0' to mark them as counted
                for (int j = i; j < n; j++) {
                    if (currentChar == characters[j]) {
                        characters[j] = '\0';
                    }
                }
            }
        }
    }
}
