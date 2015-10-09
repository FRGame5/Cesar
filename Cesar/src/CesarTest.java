import static org.junit.Assert.*;

import org.junit.Test;


public class CesarTest {
	Cesar c = new Cesar();
	Alphabet a = new Alphabet();
	@Test
	public void testDecaler() {
		assertEquals('B',c.decaler('A', a.position('B')));
		assertEquals('A',c.decaler('Y', a.position('C')));
		assertEquals('A',c.decaler('F', -a.position('F')));
		assertEquals('V',c.decaler('A', -a.position('F')));
	}
	
	
	@Test
	public void testCoder() {
		assertEquals("GTSOTZW RW UMJQUX", c.coder("Bonjour Mr Phelps", 'F'));
		assertEquals("NQX TSY IJX HMFUJFZC WTSIX ANAJ QF GWJYFLSJ NQX TSY IJX HMFUJFZC WTSIX ANAJ QJX GWJYTSX", c.coder("ILS ONT DES CHAPEAUX RONDS VIVE LA BRETAGNE ILS ONT DES CHAPEAUX RONDS VIVE LES BRETONS", 'F'));
		assertEquals("YB UJQYJ KD FUJYJ DQLYHU GKY D QLQYJ ZQCQYI DQLYWKU XEXU XEXU", c.coder("Il etait un petit navire qui n avait jamais navigue hohe hohe", 'Q'));
		
	}

	@Test
	public void testDecoder() {
		assertEquals("BONJOUR MR PHELPS", c.deCoder("GTSOTZW RW UMJQUX", 'F'));
		assertEquals("ILS ONT DES CHAPEAUX RONDS VIVE LA BRETAGNE ILS ONT DES CHAPEAUX RONDS VIVE LES BRETONS", c.deCoder("NQX TSY IJX HMFUJFZC WTSIX ANAJ QF GWJYFLSJ NQX TSY IJX HMFUJFZC WTSIX ANAJ QJX GWJYTSX", 'F'));
		assertEquals("IL ETAIT UN PETIT NAVIRE QUI N AVAIT JAMAIS NAVIGUE HOHE HOHE", c.deCoder("YB UJQYJ KD FUJYJ DQLYHU GKY D QLQYJ ZQCQYI DQLYWKU XEXU XEXU", 'Q'));
	}
	
	@Test
	public void testdecoderSansCle(){
		assertEquals("Bonjour je m appelle loic et je fait un programme pour decoder le code vigenere je suis accompagne de jacques pour m accompagner dans ce projet de code cesar et vigenere ce message est tres long pour pouvoir etre dechiffreBonjour je m appelle loic et je fait un programme pour decoder le code vigenere je suis accompagne de jacques pour m accompagner dans ce projet de code cesar et vigenere ce message est tres long pour pouvoir etre dechiffreBonjour je m appelle loic et je fait un programme pour decoder le code vigenere je suis accompagne de jacques pour m accompagner dans ce projet de code cesar et vigenere ce message est tres long pour pouvoir etre dechiffre".toUpperCase(), c.decoderSansCle("KXWSXDA SN V JYYNUUN UXRL NC SN OJRC DW YAXPAJVVN YXDA MNLXMNA UN LXMN ERPNWNAN SN BDRB JLLXVYJPWN MN SJLZDNB YXDA V JLLXVYJPWNA MJWB LN YAXSNC MN LXMN LNBJA NC ERPNWNAN LN VNBBJPN NBC CANB UXWP YXDA YXDEXRA NCAN MNLQROOANKXWSXDA SN V JYYNUUN UXRL NC SN OJRC DW YAXPAJVVN YXDA MNLXMNA UN LXMN ERPNWNAN SN BDRB JLLXVYJPWN MN SJLZDNB YXDA V JLLXVYJPWNA MJWB LN YAXSNC MN LXMN LNBJA NC ERPNWNAN LN VNBBJPN NBC CANB UXWP YXDA YXDEXRA NCAN MNLQROOANKXWSXDA SN V JYYNUUN UXRL NC SN OJRC DW YAXPAJVVN YXDA MNLXMNA UN LXMN ERPNWNAN SN BDRB JLLXVYJPWN MN SJLZDNB YXDA V JLLXVYJPWNA MJWB LN YAXSNC MN LXMN LNBJA NC ERPNWNAN LN VNBBJPN NBC CANB UXWP YXDA YXDEXRA NCAN MNLQROOAN"));

	}
}
