package in.btm;

public class Panagram {
	public static boolean isPangram(String str) {
        str = str.toLowerCase(); // Convert the input to lowercase for case-insensitivity
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

      
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true; 
    }
	public static void main(String[] args) {
        String S = "The quick brown fox jumps over the lazy dog"; // Replace with your input string
        boolean isPangram = isPangram(S);
        
        if (isPangram) {
            System.out.println("The S is a pangram.");
        } else {
            System.out.println("The S is not a pangram.");
        }
    }
}
