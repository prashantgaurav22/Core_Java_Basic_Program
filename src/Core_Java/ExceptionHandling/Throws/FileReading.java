package Core_Java.ExceptionHandling.Throws;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\TestChecked\\Test2.text");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
