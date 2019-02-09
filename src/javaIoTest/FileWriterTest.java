package javaIoTest;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("FWTEST.java", true);
		
		fw.write(97);
		fw.write('a');
		fw.write("\r\njava");
		
		fw.close();
		
	}
}
