import java.util.Arrays;


public class Cesar {
	private int msg[];
	private char cle;
	private Alphabet a;
	public Cesar(String msg, char cle){
		this.msg = new int[msg.length()];
		this.cle = cle;
		msg = msg.toUpperCase();
		for(int i = 0;i<msg.length();i++)
		{
			//this.msg[i] = 
			System.out.println(a.position(msg.charAt(i)));
		}
		
	}
	@Override
	public String toString() {
		return "Cesar [msg=" + Arrays.toString(msg) + ", cle=" + cle + "]";
	}
	
	

}
