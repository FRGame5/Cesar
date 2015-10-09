import java.util.Arrays;

public class Cesar {
	private Alphabet a;

	public Cesar() {
		a = new Alphabet();
	}

	public char decaler(char entree, int decalage) {
		if(entree == ' ')
			return ' ';
		if (decalage <= 0) {
			return(a.lettreCorrespondante((a.position(entree) + 26 - Math.abs(decalage))%26));			
		}else{
			return(a.lettreCorrespondante((a.position(entree) + Math.abs(decalage))%26));			
		}
	}

	public String coder(String entree, char cle) {
		String sortie = new String();
		entree = entree.toUpperCase();
		for (int i = 0; i < entree.length(); i++) {
			sortie = sortie.concat(Character.toString(this.decaler(entree.charAt(i), a.position(cle))));
		}
		return sortie;
	}

	public String deCoder(String entree, char cle) {
		String sortie = new String();
		entree = entree.toUpperCase();
		for (int i = 0; i < entree.length(); i++) {
			sortie = sortie.concat(Character.toString(this.decaler(
					entree.charAt(i), -this.a.position(cle))));
		}
		return sortie;
	}

	public int[] frequence(String entree) {
		int[] freq = new int[27];
		for (int i = 0; i < entree.length(); i++) {
			freq[this.a.position(entree.charAt(i))]++;
		}
		return freq;
	}

	public char trouverClee(String entree) {
		float freqFr[] = {7.68F, 0.8F, 3.32F, 3.6F, 17.76F, 1.06F, 1.1F,
				0.64F, 7.63F, 0.19F, 0F, 5.89F, 2.72F, 7.61F, 5.34F, 3.24F,
				1.34F, 6.81F, 8.23F, 7.3F, 6.05F, 1.27F, 0F, 0.54F, 0.21F,
				0.07F , 0F};
		int freqMot[] = this.frequence(entree);
		float probat[] = new float[27];
		int retour = 0;
		float freqRetour = 0F;
		for (int i = 0; i < probat.length; i++) {
			for (int j = 0; j < probat.length; j++) {
				probat[i] += freqFr[j] * freqMot[(j + i)%27];
			}
		}
		for (int i = 0; i < probat.length; i++) {
			if (probat[i] > freqRetour) {
				freqRetour = probat[i];
				retour = i;
			}
		}

		return this.a.lettreCorrespondante(retour );
	}
	
	public String decoderSansCle(String entree)
	{
		return this.deCoder(entree,this.trouverClee(entree));
	}

}
