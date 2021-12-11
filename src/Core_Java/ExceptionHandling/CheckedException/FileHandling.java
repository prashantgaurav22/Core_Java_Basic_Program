package Core_Java.ExceptionHandling.CheckedException;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
	FileWriter fw = null;
	
	try {
		fw=new FileWriter("D:\\TestChecked\\Test1.text");
		fw.write("Hello World");
	} catch (IOException e) {
		
		System.out.println("Please Enter the valid Path ");
	}
	
	finally
	{
	try {
		fw.close();
	} catch (IOException e) {
		
	    System.out.println("Please close the connection manually ");
	}
		
	}

	}

}
