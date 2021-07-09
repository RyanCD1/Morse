package morsecode;

import java.util.HashMap;

public class Translate {

	private final String alphabet = "abcdefghijklmnopqrstuvwxyz ";
	private final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
			".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
			"/" };

	private HashMap<String, String> decode;

	public Translate() {
		decode = new HashMap<>();
		char[] alphaArray = alphabet.toCharArray();
		for (int i = 0; i < morse.length; i++) {
			decode.put(morse[i], String.valueOf(alphaArray[i]));
		}
	}

	public String decode(String input) {

		String[] code = input.split(" ");
		String result = "";

		for (int i = 0; i < code.length; i++) {
			if (decode.containsKey(code[i])) {
				result += decode.get(code[i]);
			}
		}
		return result;
	}
}
