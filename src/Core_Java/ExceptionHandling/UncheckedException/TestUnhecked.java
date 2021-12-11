package Core_Java.ExceptionHandling.UncheckedException;
public class TestUnhecked {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println(c); // Arithmetic Exception
		int a1[] = new int[3]; // Array Index Out Of Boundary Exception
		
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		a1[3]=4;
		a1[4]=5;
		
	for (int i = 0; i < a1.length; i++) 
	{
		System.out.println(a1[i]);	
		
	}
	}
}