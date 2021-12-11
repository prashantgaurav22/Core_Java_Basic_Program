package Core_Java.ExceptionHandling.CheckedException;

import java.io.FileWriter;
import java.io.IOException;

public class HelloText 
{
public static void main(String[] args) {
	FileWriter fw = null;
	
	try 
	{
		fw = new FileWriter("D:\\TestChecked\\Test5.text");
		fw.write("Hi Brother");
	}
	catch (IOException e) 
	{
	  System.out.println("Please Enter the valid path");
	}
	
	finally
	{
		try {
			fw.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Please close the connection Manually");
		}
	}
}
}
