package programe;

import java.util.Scanner;

public class Vigenere {
	private Alphabet a;
    private Cesar c;
    private Scanner scan;

    public Vigenere()
    {
        a = new Alphabet();
        c = new Cesar();
        scan = new Scanner(System.in);
    }
    
    

    public String coder(String entree, String code)
    {
    	code = code.toUpperCase();
        String sortie = new String("");
        //entree = entree.replaceAll(" ", "");
        for (int i = 0; i < entree.length(); i++) {
            sortie = sortie.concat(c.coder(Character.toString(entree.charAt(i)), code.charAt(i%code.length())));
        }
        return sortie;
    }

    public String decoder(String entree, String code)
    {
    	code = code.toUpperCase();
        String sortie = new String("");
        //entree = entree.replaceAll(" ", "");
        for (int i = 0; i < entree.length(); i++) {
            sortie = sortie.concat(c.deCoder(Character.toString(entree.charAt(i)), code.charAt(i%code.length())));
        }
        return sortie;
    }
    
    public String attaqueBruteForce(String entree, int longueur)
    {
    	entree = entree.toUpperCase();
    	char tabcle[] = new char[longueur];
    	String sortie = "";
    	for (int i = 0; i < longueur; i++) {
			tabcle[i] = 'A';
		}
    	String cle = "";
    	int i=0;
    	while(true)
    	{
    		if(i%1000==0)
    			System.out.println(i);
    		i++;
    		cle = new String(tabcle);
    		if(cle == "ZZZZZZ")
    			return "non trouvé";
    		if(this.indiceCoincidence(coder(entree, cle))>=0.075 && this.indiceCoincidence(this.coder(entree,cle))<=0.079)
			{
    			return this.coder(entree, cle);
    			
			}
    		tabcle = this.decalerCle(tabcle);
    		
    	}
    	
    	
    }
    
    
    private char[] decalerCle(char[] cle)
    {
    	boolean decale = false;
    	cle[cle.length-1]=c.decaler(cle[cle.length-1], 1);
    	if(cle[cle.length-1]=='A')
    		decale=true;
    	for (int i = cle.length-1; i > 0; i--) {
			if(cle[i]=='A'&&decale==true)
			{
				cle[i-1] = c.decaler(cle[i-1], 1);
			}
			if(cle[i-1]!='A')
				decale=false;
		}
    	return cle;
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
				
				System.out.println("Clée non trouvée... Sa longueur est de " + (i+1) + ".\nVoullez-vous lancer l'attaque à Force Brute ?\n(À titre d'information, ceci vouz ferrez patienter environs " + (Math.pow(i+1, 26)/12000) + " minutes.)\nSi vous souhaitez lancer l'attaque à Force Brute, tapez 1, sinon tapez 2");
				int choix = scan.nextInt();
				if (choix == 1){
					this.attaqueBruteForce(entree, i+1);
				}
				
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
