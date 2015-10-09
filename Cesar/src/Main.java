
public class Main {

	public static void main(String[] args) {
		Vigenere v = new Vigenere();
		Alphabet a = new Alphabet();
		Cesar c = new Cesar();
		System.out.println("Code Vigenere");
		String str = "Bonjour je m appelle loic et je fait un programme pour decoder le code vigenere je suis accompagne de jacques pour m accompagner dans ce projet de code cesar et vigenere ce message est tres long pour pouvoir etre dechiffreBonjour je m appelle loic et je fait un programme pour decoder le code vigenere je suis accompagne de jacques pour m accompagner dans ce projet de code cesar et vigenere ce message est tres long pour pouvoir etre dechiffreBonjour je m appelle loic et je fait un programme pour decoder le code vigenere je suis accompagne de jacques pour m accompagner dans ce projet de code cesar et vigenere ce message est tres long pour pouvoir etre dechiffre";
		System.out.println(v.trouverLongueurCle(v.coder(str, "GREFED")));
		//System.out.print(v.deCoder(test, "vigenere"));
	}

}
