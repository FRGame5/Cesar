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
        String sortie = new String("");
        for (int i = 0; i < entree.length(); i++) {
            sortie = sortie.concat(c.coder(Character.toString(entree.charAt(i)), code.charAt(i%code.length())));
        }
        return sortie;
    }

    public String deCoder(String entree, String code)
    {
        String sortie = new String("");
        for (int i = 0; i < entree.length(); i++) {
            sortie = sortie.concat(c.deCoder(Character.toString(entree.charAt(i)), code.charAt(i%code.length())));
        }
        return sortie;
    }

}
