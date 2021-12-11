package Core_Java.ExceptionHandling.CheckedException;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 
{
 public static void main(String[] args) 
 {
	FileWriter fw = null;
	try 
	{	
			fw = new FileWriter("D:\\TestChecked\\Test4.text");
			fw.write("Hello Indians");
		} 
		catch (IOException e) 
		{
			System.out.println("Please Enter the Valid Path");
		}
	try
	{
		fw.close();
	} 
	catch (IOException e)
	{
		System.out.println("Close the connection Manually");
	}
	}
}

