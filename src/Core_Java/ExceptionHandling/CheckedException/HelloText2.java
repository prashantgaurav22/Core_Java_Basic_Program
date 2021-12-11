package Core_Java.ExceptionHandling.CheckedException;
import java.io.FileWriter;
import java.io.IOException;

public class HelloText2 
{
public static void main(String[] args) {
	FileWriter fw = null;
	
	try {
		fw = new FileWriter("D:\\TestChecked\\Test6.text");
		fw.write("Hello Friends Welcome to Bangalore");
	} 
	catch (IOException e) 
	{
	  System.out.println("Please Enter the Valid path");
	}
finally
{
	try {
		fw.close ();
	} catch (IOException e) 
	{
         System.out.println("Please close the connection Manually");
	}
}
			
}
}
