
public class Main {

	public static void main(String[] args) {
		Alphabet a = new Alphabet();
		Cesar c= new Cesar("NQX TSY IJX HMFUJFZC WTSIX ANAJ QF GWJYFLSJ NQX TSY IJX HMFUJFZC WTSIX ANAJ QJX GWJYTSX", 'E');
		System.out.println(c.toString());
		c.getFrequenceLettre();
		System.out.println(c.toString());
		System.out.println(c.getMsgCode());
		System.out.println(c.getMsg());
	}

}
