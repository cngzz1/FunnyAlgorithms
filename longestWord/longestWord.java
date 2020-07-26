public class LongestWord {

	public static void main(String[] args) {
		String str = "Find the longest word";
		String[] word = str.split(" ");
		String longWord = " ";
		for (int i = 0; i < word.length; i++) {
			for (int j = 1 + i; j < word.length; j++) {
				if (word[i].length() >= word[j].length()) {
					longWord = word[i];
				}
			}
		}
		System.out.println(longWord + " is longest word with " + longWord.length() + " characters");
		System.out.println(str.length());
	}
}
