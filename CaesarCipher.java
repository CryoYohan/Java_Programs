package teenActivities;

public class CaesarCipher {
	protected char[] encoder = new char[26];	// Encryption array
	protected char[] decoder = new char[26];	// Decryption array
	
	// Constructor that initializes the encryption and decryption arrays
	public CaesarCipher(int rotation) {
		for(int k = 0; k < 26;k++) {
			encoder[k] = (char)('A' + (k + rotation) % 26);
			decoder[k] = (char)('A' + (k - rotation + 26) % 26);
		}
	}
	// Returns String representing encrypted message
	public String encrypt(String message) {
		return transform(message, encoder);		// use encoder array
	}
	// Returns decrypted message give encrypted secret
	public String decrypt(String secret) {
		return transform(secret, decoder);		// use decoder array
	}
	// Returns transformation of original String using given code
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray();
		for(int k =0; k < msg.length; k++) {
			if(Character.isUpperCase(msg[k])) { 	// We have a letter to change
				int j =msg[k] - 'A';				// will be value from 0-25
				msg[k] = code[j];					// replace the character
			}
		}
		return new String(msg);
	}
}
