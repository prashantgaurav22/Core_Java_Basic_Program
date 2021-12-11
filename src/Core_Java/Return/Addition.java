package Core_Java.Return;

public class Addition {
int add() {
	 int a= 2;
	 int b= 3;
	 int c= a+b;
	 return c;
}
public static void main(String[] args) {
	Addition a = new Addition();
	System.out.println(a.add());
}
}

