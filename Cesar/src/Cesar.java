import java.util.Arrays;

public class Cesar {
	private int entree[];
	private int sortie[];
	private int freq[];
	private Character cle;
	private Alphabet a;

	public Cesar(String entree, char cle) {
		a = new Alphabet();
		this.entree = new int[entree.length()];
		this.sortie = new int[entree.length()];
		this.cle = cle;
		entree = entree.toUpperCase();
		for (int i = 0; i < entree.length(); i++) {
			this.entree[i] = a.position(entree.charAt(i));
		}

	}

	public void coder() {
		for (int i = 0; i < entree.length; i++) {
			sortie[i] = (entree[i] + a.position(cle)) % 27;
			if (sortie[i] == 0)
				sortie[i]++;
		}
	}

	public void deCoder() {
		for (int i = 0; i < entree.length; i++) {
			sortie[i] = (entree[i] - a.position(cle));
			if (sortie[i] < 1)
				sortie[i] += 26;
			if (entree[i] == 0)
				sortie[i] = 0;
		}
	}

	public String getEntree() {
		String retour = new String("");
		for (int i = 0; i < entree.length; i++) {
			retour = retour.concat(a.lettreCorrespondante(entree[i]).toString());
		}
		return retour;
	}

	public String getSortie() {
		String retour = new String("");
		for (int i = 0; i < sortie.length; i++) {
			retour = retour.concat(a.lettreCorrespondante(sortie[i]).toString());
		}
		return retour;
	}

	public int[] getFrequenceLettre() {
		int retour[] = new int[27];
		for (int i = 0; i < entree.length; i++) {
			retour[entree[i]] += 1;
		}
		this.freq = retour;
		return retour;
	}

	public char trouverClee() {
		int max = 0;
		int lettre = 0;
		for(int i = 1; i<freq.length;i++)
		{
			if(max<freq[i])
			{
				lettre = i;
				max = freq[i];
			}
			
		}
		return a.lettreCorrespondante(lettre-5); // lettre E
	}

	@Override
	public String toString() {
		return "Cesar [entree=" + Arrays.toString(entree) + ", sortie="
				+ Arrays.toString(sortie) + ", freq=" + Arrays.toString(freq)
				+ ", cle=" + cle + "]";
	}

}
