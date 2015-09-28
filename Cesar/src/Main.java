
public class Main {

	public static void main(String[] args) {
		Alphabet a = new Alphabet();
		Vigenere v = new Vigenere("si c est jeudi c est qu il y a des frites", "RAVIOLI");
		v.coder();
		System.out.println(v.getSortie());
	}

}
