import java.util.Arrays;

public class Cesar {
	private Alphabet a;

	public Cesar() {
		a = new Alphabet();
	}

	public char decaler(char entree, int decalage)
	{
		if(a.position(entree) == 0)
			return ' ';
		if(decalage<=0)
		{
			if(a.lettreCorrespondante(-decalage) == entree)
				return 'Z';
			return a.lettreCorrespondante((a.position(entree)+ 26 + decalage)%26);
		}else
		{
			return a.lettreCorrespondante((a.position(entree) + decalage)%26);
		}
	}

	public String coder(String entree, char cle) {
		String sortie = new String();
		for (int i = 0; i<entree.length();i++)
		{
			sortie = sortie.concat(Character.toString(this.decaler(entree.charAt(i),a.position(cle))));
		}
		return sortie;
	}

	public String deCoder(String entree, char cle) {
		String sortie = new String();
		for (int i = 0; i<entree.length();i++)
		{
			sortie = sortie.concat(Character.toString(this.decaler(entree.charAt(i), -a.position(cle))));
		}
		return sortie;
	}

	public int[] frequence(String entree)
	{
		int[] freq = new int[27];
		for(int i = 0; i<entree.length();i++)
		{
			freq[a.position(entree.charAt(i))]++;
		}
		return freq;
	}

}
