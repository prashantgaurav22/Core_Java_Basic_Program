package Core_Java.Return;

public class Gmail {

	String send_Email()
	{
		String c ="Gmail is sending email";
		return c;
		
	}
	public static void main(String[] args) {
		Gmail g = new Gmail();
		System.out.println(g.send_Email());
	}
}

