package Core_Java.ExceptionHandling.Throws;

import java.io.FileWriter;
import java.io.IOException;

public class TestCheckedIn2 
{
 public static void main(String[] args) throws IOException
 {
	FileWriter fw = new FileWriter("D:\\TestChecked\\Test7.text");
	fw.write("Welcome to India!!!");
	fw.close();
}
}
