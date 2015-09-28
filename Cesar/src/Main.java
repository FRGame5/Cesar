
public class Main {

	public static void main(String[] args) {
		Alphabet a = new Alphabet();
		Cesar c= new Cesar("YB UJQYJ KD FUJYJ DQLYHU GKY D QLQYJ ZQCQYI DQLYWKU XEXU XEXU", 'P');
		System.out.println(c.toString());
		c.getFrequenceLettre();
		c.deCoder();
		System.out.println(c.toString());
		System.out.println(c.getSortie());
		System.out.println(c.trouverClee());
	}

}
