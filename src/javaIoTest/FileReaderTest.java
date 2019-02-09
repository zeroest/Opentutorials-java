package javaIoTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest {
	
	public static void main(String[] args) throws IOException {
		
		/*File f = new File("src/javaIoTest/FileReaderTest.java");
		if (f.exists()) {
			FileReader fr = new FileReader(f);
			
			int r = 0;
			while((r=fr.read())!=-1) {
				System.out.print((char)r);
			}
			
		}else System.out.println("file not exiest");
		*/
		File f = new File("score.txt");
		if(f.exists()) {
			FileReader fr = new FileReader(f);
			Scanner sc = new Scanner(fr);
			
			
			
			
			while(sc.hasNextLine()) {
				int sum = 0;
				int avg = 0;
				String line = sc.nextLine();
				String[] arr = line.split(" ");
				for(int i = 1 ; i<arr.length ; i++) {
					sum += Integer.parseInt(arr[i]);
				
				}
				avg = sum/3;
			
				System.out.println(line +"  "+ sum +"  "+ avg);
			}
			
			
			int r = 0;
			
			while((r=fr.read())!=-1) {
				System.out.print((char)r);
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
