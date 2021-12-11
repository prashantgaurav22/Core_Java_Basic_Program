package Core_Java.String.StringBuffer;

public class TestSB {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("Vinay");
		sb.append(" Prasad");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder ab = new StringBuilder("Sherlock");
		ab.append(" Holmes");
        System.out.println(ab);
        
        System.out.println(ab.toString());
      //  System.out.println(ab.reverse());
        System.out.println(ab.substring(2));
        System.out.println(ab.substring(1, 5));
        
        
		
	}

}
