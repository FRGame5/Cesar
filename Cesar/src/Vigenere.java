import java.util.Arrays;


public class Vigenere {
	private Alphabet a;
    private Cesar c;

    public Vigenere()
    {
        a = new Alphabet();
        c = new Cesar();
    }
    
    

    public String coder(String entree, String code)
    {
    	code = code.toUpperCase();
        String sortie = new String("");
        for (int i = 0; i < entree.length(); i++) {
            sortie = sortie.concat(c.coder(Character.toString(entree.charAt(i)), code.charAt(i%code.length())));
        }
        return sortie;
    }

    public String deCoder(String entree, String code)
    {
    	code = code.toUpperCase();
        String sortie = new String("");
        for (int i = 0; i < entree.length(); i++) {
            sortie = sortie.concat(c.deCoder(Character.toString(entree.charAt(i)), code.charAt(i%code.length())));
        }
        return sortie;
    }
    
    public void attaqueBruteForce(String entree)
    {
    	for (int i = 0; i < 20; i++) {
			System.out.println(this.deCoder(entree, this.trouverCle(entree, i+1)));
		}
    }
    
    /*
     * Cette fonction renvoie l'indice de coincidence d'un texte
     * C'est la probabilite que si nous prenons 2 lettre au hasard dans le texte
     * ce soit les meme
     */
    public float indiceCoincidence(String entree)
    {
    	entree = entree.toUpperCase();
    	float Ic = 0F;
    	float freq = 0F;
    	float n = 0F;
    	for (int i = 0; i < 25; i++) {
			freq = (float)c.frequence(entree)[i];
			n = (float)entree.length() - (float)c.frequence(entree)[26];
    		Ic += (freq*(freq-1))/(n*(n-1));
		}
    	return Ic;
    }
    
    /*
     * Fonction qui renvoie le message decode sans avoir besoi de la
     * clée de décodage
     * Il s'agit d'une methode reprenant la methode cesar
     * Cette methode ne permet pas en revanche de decoder les message cours
     */
    public String decoderSansCle(String entree)
    {
    	//initialisation des tableaux
    	String retour[] = new String[25];
    	String clee[] = new String[25];
    	float indiceSimilaire = 0F;
    	for (int i = 0; i < retour.length ; i++) {
			retour[i] = new String();
			clee[i] = new String();
		}
    	//chaque case du tableau recoit comme si la longueur de la clee etait de longueur i+1
    	for (int i = 0; i < retour.length; i++) {
			clee[i] = this.trouverCle(entree, i+1);
			retour[i] = this.deCoder(entree, clee[i]);
		}
    	//si une des case a pour indice de coincidence 0.778 +- 0.05 alors c'est le message decoder
    	for (int i = 0; i < retour.length; i++) {
    		System.out.println(this.indiceCoincidence(retour[i]));
			if(this.indiceCoincidence(retour[i])>=0.072 && this.indiceCoincidence(retour[i])<=0.082)
			{
				
				return retour[i];
			}
		}
    	indiceSimilaire = this.indiceCoincidence(retour[0]);
    	for (int i = 0; i < retour.length; i++) {
			if(this.indiceCoincidence(retour[i]) != indiceSimilaire){
				return "Clée non trouvée... Sa longueur est de " + (i+1);
			}
			
		}
    	return "Non trouvé";
    }
    
    
    
    
    /*
     * Fonction qui renvoie la clée en fonction du texte et de la longueur
     * présumée de la clé
     */
    public String trouverCle(String entree,int longueur)
    {
    	String msg[] = new String[longueur];
    	String retour = new String();
    	/*
    	 * Initialisation du tableau de messages
    	 */
    	for (int i = 0; i < longueur; i++) {
			msg[i] = new String();
		}
    	/*
    	 * On applique la methode césar a tout les tableau
    	 */
    	for (int i = 0; i < longueur; i++) {
			for (int j = 0+i; j < entree.length()-longueur; j+=longueur) {
				msg[i] = msg[i].concat(entree.valueOf(entree.charAt(j)));
			}
			retour = retour.concat(retour.valueOf(c.trouverClee(msg[i])));
		}
    	return retour;
    }

}
