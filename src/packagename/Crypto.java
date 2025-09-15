package packagename;

public class Crypto {
	public static String encrypt(String msg, int shift) {
		String alph = "abcdefghijklmnopqrstuvwxyz";
		msg = msg.toLowerCase();
		String encoded = "";
		for (int i = 0; i<msg.length(); i++) {
			int pos = alph.indexOf(msg.substring(i,i+1));
			if (pos >= 0) {
				int newpos = (pos + shift) % 26;
				char newchar = alph.charAt(newpos);
				encoded = encoded + newchar;
			} else {
				encoded = encoded + msg.substring(i,i+1);
			}
		}
	return encoded;
	}



	public static String decrypt(String msg, int shift) {
		String alph = "abcdefghijklmnopqrstuvwxyz";
		msg = msg.toLowerCase();
		String decoded = "";
		for (int i = 0; i<msg.length(); i++) {
			int pos = alph.indexOf(msg.substring(i,i+1));
			if (pos >= 0) {
				int newpos = (pos - shift + 26) % 26;
				char newchar = alph.charAt(newpos);
				decoded = decoded + newchar;
			} else {
				decoded = decoded + msg.substring(i,i+1);
			}
		}
	return decoded;
	}
}
