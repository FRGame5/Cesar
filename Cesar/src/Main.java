import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Vigenere v = new Vigenere();
		Alphabet a = new Alphabet();
		Cesar c = new Cesar();
		Scanner scan =  new Scanner(System.in);
		int entree = 0;
		String code = new String("");
		String clef = new String("");
//		System.out.println("Code Vigenere");
//		String str = "La grande porte s ouvrit lourdement en coulissant sur le côte gauche sans faire le moindre bruit  Derriere la porte  une nouvelle route  eclairee par de multiples projecteurs accroches de chaque côtes  s enfonçait dans les profondeurs de cet ouvrage  Cette route etait faite de zigzag incessant  certainement pour empêcher le souffle d une bombe atomique pensa David Le seul moyen de le stopper serait d arrêter tout les ordinateurs  ce qui aurait les mêmes consequences que de laisser Prelude lancer les bombes  Depuis longtemps  toutes les installations à risque etaient contrôlees par des ordinateurs  Si l on stoppait les ordinateurs  les centrales nucleaires s emballeraient  les silos nucleaires cracheraient leur mort sur toute la planete  Bien entendu  l economie mondiale dirigee par la bourse  s effondrerait  David ne savait plus quoi faire et  manifestement  tout les militaires presents dans la salle comptaient sur lui pour resoudre cette criseCela ressemblait aux gros ordinateurs que David avait pu voir dans des films de science fiction  Beaucoup de petites lumieres indiquaient qu il etait en fonction  A la base  une sorte d aquarium avait ete installe tout autour  Certainement le systeme de refroidissement car des bulles montaient sans cesse  preuve que l eau etait en ebullition  Soudain  David resta bouche bee  Une voix caverneuse sortie des ecrans où venait de s afficher le mot Prelude Il avait d abord commencer par recuperer des informations depuis l ordinateur de David  puis il etait alle les chercher sur Internet  Il avait lui même programme l ordinateur de David afin d avoir un premier lien vers le monde exterieur  la voix  Il pouvait entendre la voix de David  mais ne la comprenait pas  C est alors qu il a decider d aller lui même à l information  Il s est alors ‘transporte  sur Internet afin de choisir une nouvelle maison   Il lui a ete beaucoup plus facile de programmer ce nouvel ordinateur afin d entendre une nouvelle voix David se rappelait de ce programme melangeant deux anciennes technologies  Il s en souvenait tres bien  cinq annees de travail acharne pour realiser un vieux rêve d enfant un peu solitaire  Il voulait un ami et il avait trouve en l informatique la possibilite d avoir cet ami  Un ami capable de reflechir vite  exempt de sentiments ";
//		String strCode = v.coder(str, "CES");
		//String strCode = "VH LSLE M LOJHGPE XI BVBC BE XI XBIR ZOUA NB VGL IX V OZT NYS P POBR NJUE WZWOPRUZM CVIR HOKMEE SYLS EWEJIQ AAD TYUGRCMBA MLTRC LGVO IRGJLQZK ZUP JA FWWIE BC CTIMBN BC NACC";
//		System.out.println(v.attaqueBruteForce(strCode, 5));
		
		
		
		System.out.println("Bonjour et bienvenue dans le programme de chiffrement \net déchiffrement selon les methodes César et Vigenère\n\n");
		while(entree != 7)
		{
			entree = 0;
			System.out.println("MENU\n1-Coder selon la methode Cesar\n2-Coder avec la methode Vigenere\n3-Decoder Cesar avec la clef\n4-Decoder Vigenere avec la clef\n5-Decoder Cesar sans la clef\n6-Decoder Vigenere sans la clef\n7-Quitter l'application");
			try{
				scan.next();
				entree = scan.nextInt();	
			}catch(java.util.InputMismatchException e)
			{
				entree = 10000;
			}
			switch(entree)
			{
			case 1:
				System.out.println("Codage methode Cesar\nVeuillez entrer le message a coder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Veuillez entrer la clef avec laquelle encoder :");
				clef = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" codé avec la clef " + clef.toUpperCase().charAt(0) + " est :\n\"" + c.coder(code.toUpperCase(), clef.toUpperCase().charAt(0)) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 2:
				System.out.println("Codage methode Vigenere\nVeuillez entrer le message a coder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Veuillez entrer la clef avec laquelle encoder :");
				clef = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" codé avec la clef " + clef.toUpperCase() + " est :\n\"" + v.coder(code.toUpperCase(), clef.toUpperCase()) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 3:
				System.out.println("Decodage methode Cesar\nVeuillez entrer le message a decoder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Veuillez entrer la clef avec laquelle decoder :");
				clef = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" décodé avec la clef " + clef.toUpperCase().charAt(0) + " est :\n\"" + c.deCoder(code.toUpperCase(), clef.toUpperCase().charAt(0)) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 4:
				System.out.println("Decodage methode Vigenere\nVeuillez entrer le message a decoder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Veuillez entrer la clef avec laquelle decoder :");
				clef = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" decodé avec la clef " + clef.toUpperCase() + " est :\n\"" + v.deCoder(code.toUpperCase(), clef.toUpperCase()) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 5:
				System.out.println("Decodage methode Cesar sans clef\nVeuillez entrer le message a decoder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" décodé est :\n\""  + v.decoderSansCle(code.toUpperCase()) + "\nLa clef est " + c.trouverClee(code.toUpperCase()) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 6:
				System.out.println("Decodage methode Vigenere sans clef\nVeuillez entrer le message a decoder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" décodé est :\n\""  + v.decoderSansCle(code.toUpperCase()) + "\"\nPour retourner au menu tapez n'importe quoi");
				clef = scan.nextLine();
				break;
			case 7:
				System.out.println("Quitter");
				break;
			default :
				System.out.println("Vous n'avez pas entré de chiffre dans l'intervale");
				
			}
		}
		
	}

}
