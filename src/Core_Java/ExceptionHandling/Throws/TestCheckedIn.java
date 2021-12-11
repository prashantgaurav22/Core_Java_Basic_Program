
package Core_Java.ExceptionHandling.Throws;

import java.io.FileWriter;
import java.io.IOException;

public class TestCheckedIn 
{
 public static void main(String[] args) throws IOException{
	FileWriter fw = new FileWriter("D:\\TestChecked\\Test2.text");
	fw.write("Welcome to Java Class");
	fw.close();
}
}
