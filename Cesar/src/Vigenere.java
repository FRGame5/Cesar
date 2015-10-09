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
    
    public int trouverLongueurCle(String entree)
    {
    	
    	float n = (float)entree.length() - (float)c.frequence(entree)[26];
    	float d = ((0.074F-0.038F)*n)/((n-1)*this.indiceCoincidence(entree)-n*0.038F+0.074F);
    	
    	if (d <= 0.036F){
    		return 8;
    	}else if(d > 0.036F && d <= 0.036F){
    		return 1257;
    	}else if(d > 0.046F && d <= 0.056F){
    		return 4;
    	}else if(d > 0.056F && d <= 0.066F){
    		return 368;
    	}else if(d > 0.066F){
    		return 9;
    	}
		return 0;
    	
    }
    
//    public String trouverClee(String entree, int longueur)
//    {
//    	String retour = "";
//    	for (int i = 0; i < entree.length(); i++) {
//			
//		}
//    }

}
