
public class Alphabet {
	private char alphabet[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public Alphabet(){
	}
	
	public int position(char c){
		int retour = 0;
		for(int i=0;i<this.alphabet.length;i++)
		{
			if(c==this.alphabet[i])
			{
				retour = i;
			}
		}
		return retour;
	}

}
