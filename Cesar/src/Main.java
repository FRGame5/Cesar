
public class Main {

	public static void main(String[] args) {
		Vigenere v = new Vigenere();
		Alphabet a = new Alphabet();
		System.out.println("Code Vigenere");
		String test = v.coder("AAABBB", "HG");
		System.out.print(test + "\n");
		System.out.print(v.deCoder(test, "HG"));
	}

}
