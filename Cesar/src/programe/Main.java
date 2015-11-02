package programe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.awt.*;


public class Main extends Application{

	@FXML
	Button EncoderCesar;
	@FXML
	Button DecoderCesar;
	@FXML
	Button DecoderCesarSansCle;
	@FXML
	Button EncoderVigenere;
	@FXML
	Button DecoderVigenere;
	@FXML
	Button DecoderVigenereSansCle;
	@FXML
	TextArea chpSaisieEncoderCesar; //chpSaisieEncoderCesar.getText();
	@FXML
	TextArea chpCleEncoderCesar;
	@FXML
	TextArea chpRetourEncoderCesar;
	@FXML
	TextArea chpSaisieDecoderCesar;
	@FXML
	TextArea chpCleDecoderCesar;
	@FXML
	TextArea chpRetourDecoderCesar;
	@FXML
	TextArea chpSaisieDecoderCesarSansCle;
	@FXML
	TextArea chpRetourDecoderCesarSansCle;
	@FXML
	TextArea chpSaisieEncoderVigenere;
	@FXML
	TextArea chpCleEncoderVigenere;
	@FXML
	TextArea chpRetourEncoderVigenere;
	@FXML
	TextArea chpSaisieDecoderVigenere;
	@FXML
	TextArea chpCleDecoderVigenere;
	@FXML
	TextArea chpRetourDecoderVigenere;
	@FXML
	TextArea chpSaisieDecoderVigenereSansCle;
	@FXML
	TextArea chpRetourDecoderVigenereSansCle;



	public static void main(String[] args) {






		/*Vigenere v = new Vigenere();
		Alphabet a = new Alphabet();
		Cesar c = new Cesar();
		Scanner scan =  new Scanner(System.in);
		int entree = 0;
		String code = new String("");
		String clef = new String("");
//		System.out.println("Code programe.Vigenere");
//		String str = "La grande porte s ouvrit lourdement en coulissant sur le côte gauche sans faire le moindre bruit  Derriere la porte  une nouvelle route  eclairee par de multiples projecteurs accroches de chaque côtes  s enfonçait dans les profondeurs de cet ouvrage  Cette route etait faite de zigzag incessant  certainement pour empêcher le souffle d une bombe atomique pensa David Le seul moyen de le stopper serait d arrêter tout les ordinateurs  ce qui aurait les mêmes consequences que de laisser Prelude lancer les bombes  Depuis longtemps  toutes les installations à risque etaient contrôlees par des ordinateurs  Si l on stoppait les ordinateurs  les centrales nucleaires s emballeraient  les silos nucleaires cracheraient leur mort sur toute la planete  Bien entendu  l economie mondiale dirigee par la bourse  s effondrerait  David ne savait plus quoi faire et  manifestement  tout les militaires presents dans la salle comptaient sur lui pour resoudre cette criseCela ressemblait aux gros ordinateurs que David avait pu voir dans des films de science fiction  Beaucoup de petites lumieres indiquaient qu il etait en fonction  A la base  une sorte d aquarium avait ete installe tout autour  Certainement le systeme de refroidissement car des bulles montaient sans cesse  preuve que l eau etait en ebullition  Soudain  David resta bouche bee  Une voix caverneuse sortie des ecrans où venait de s afficher le mot Prelude Il avait d abord commencer par recuperer des informations depuis l ordinateur de David  puis il etait alle les chercher sur Internet  Il avait lui même programme l ordinateur de David afin d avoir un premier lien vers le monde exterieur  la voix  Il pouvait entendre la voix de David  mais ne la comprenait pas  C est alors qu il a decider d aller lui même à l information  Il s est alors ‘transporte  sur Internet afin de choisir une nouvelle maison   Il lui a ete beaucoup plus facile de programmer ce nouvel ordinateur afin d entendre une nouvelle voix David se rappelait de ce programme melangeant deux anciennes technologies  Il s en souvenait tres bien  cinq annees de travail acharne pour realiser un vieux rêve d enfant un peu solitaire  Il voulait un ami et il avait trouve en l informatique la possibilite d avoir cet ami  Un ami capable de reflechir vite  exempt de sentiments ";
//		String strCode = v.coder(str, "CES");
		//String strCode = "VH LSLE M LOJHGPE XI BVBC BE XI XBIR ZOUA NB VGL IX V OZT NYS P POBR NJUE WZWOPRUZM CVIR HOKMEE SYLS EWEJIQ AAD TYUGRCMBA MLTRC LGVO IRGJLQZK ZUP JA FWWIE BC CTIMBN BC NACC";
//		System.out.println(v.attaqueBruteForce(strCode, 5));
		
		
		
		System.out.println("Bonjour et bienvenue dans le programme de chiffrement \net déchiffrement selon les methodes César et Vigenère\n\n");
		while(entree != 7)
		{
			entree = 0;
			System.out.println("MENU\n1-Coder selon la methode programe.Cesar\n2-Coder avec la methode programe.Vigenere\n3-Decoder programe.Cesar avec la clef\n4-Decoder programe.Vigenere avec la clef\n5-Decoder programe.Cesar sans la clef\n6-Decoder programe.Vigenere sans la clef\n7-Quitter l'application");
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
				System.out.println("Codage methode programe.Cesar\nVeuillez entrer le message a coder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Veuillez entrer la clef avec laquelle encoder :");
				clef = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" codé avec la clef " + clef.toUpperCase().charAt(0) + " est :\n\"" + c.coder(code.toUpperCase(), clef.toUpperCase().charAt(0)) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 2:
				System.out.println("Codage methode programe.Vigenere\nVeuillez entrer le message a coder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Veuillez entrer la clef avec laquelle encoder :");
				clef = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" codé avec la clef " + clef.toUpperCase() + " est :\n\"" + v.coder(code.toUpperCase(), clef.toUpperCase()) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 3:
				System.out.println("Decodage methode programe.Cesar\nVeuillez entrer le message a decoder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Veuillez entrer la clef avec laquelle decoder :");
				clef = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" décodé avec la clef " + clef.toUpperCase().charAt(0) + " est :\n\"" + c.deCoder(code.toUpperCase(), clef.toUpperCase().charAt(0)) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 4:
				System.out.println("Decodage methode programe.Vigenere\nVeuillez entrer le message a decoder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Veuillez entrer la clef avec laquelle decoder :");
				clef = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" decodé avec la clef " + clef.toUpperCase() + " est :\n\"" + v.deCoder(code.toUpperCase(), clef.toUpperCase()) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 5:
				System.out.println("Decodage methode programe.Cesar sans clef\nVeuillez entrer le message a decoder :");
				scan.nextLine();
				code = scan.nextLine();
				System.out.println("Le message  \"" + code.toUpperCase() + "\" décodé est :\n\""  + v.decoderSansCle(code.toUpperCase()) + "\nLa clef est " + c.trouverClee(code.toUpperCase()) + "\"\nPour retourner au menu tapez n'importe quoi");
				scan.nextLine();
				break;
			case 6:
				System.out.println("Decodage methode programe.Vigenere sans clef\nVeuillez entrer le message a decoder :");
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
		}*/
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

	}
}
