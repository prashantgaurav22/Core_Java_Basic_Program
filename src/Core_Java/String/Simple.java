package Core_Java.String;
public class Simple {
	public static void main(String[] args) {
		String s1 = "A book on Java";
		String s2 = new String("I like it");
		char arr[]= {'D','r','e','a','m','t','e','c','h',' ','P','r','e','s','s'};
		String s3 = new String(arr);
		String s4 = "Banty";
		String s5 = "bunty";
		String s6 = "bunty";
		//print
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Contents
		System.out.println(s1.contains(s2));
		
		//Adress
		System.out.println(s2.contentEquals(s1));
		System.out.println(s3.equals(s2));
		System.out.println(s4==s5);
		System.out.println(s4.contains(s5));
		System.out.println(s4.contentEquals(s5));
		System.out.println(s5==s6);
		System.out.println(s5.contentEquals(s6));
		
		//length contents
		System.out.println(s4.length());
		System.out.println(s1.charAt(3));
		System.out.println(s5.compareTo(s4));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s4.equalsIgnoreCase(s6));
		
		//Start Ends
		System.out.println(s1.startsWith(s6));
		System.out.println(s1.indexOf("b"));
		System.out.println(s1.startsWith("A"));
		System.out.println(s5.endsWith("y"));
		System.out.println(s5.lastIndexOf(s5));
		
		//Concat
		System.out.println(s5.concat(s6));
		System.out.println(s6.subSequence(0, 3));
		System.out.println(s1.toCharArray());
		
		//Upper & Lower Case
		System.out.println(s5.toUpperCase());
		System.out.println(s6.toLowerCase());
		
		//trim
		System.out.println(s2.trim());
		System.out.println(s2.split(" "));
	
			
			
		
	}

	
}
