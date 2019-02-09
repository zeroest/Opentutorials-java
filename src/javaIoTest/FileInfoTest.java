package javaIoTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfoTest {
	public static void main(String[] args) throws IOException {
		System.out.println("파일 입력");
		//Scanner sc = new Scanner(System.in);
		
		//String name = sc.nextLine();
		String name = ".";
		File file = new File(name);
		
		
		if(file.exists()) {
			if(file.isFile()) {
				System.out.println(file.getAbsolutePath());
				System.out.println(file.getPath());
				System.out.println(file.length());
				
				Date date = new Date(file.lastModified());
				SimpleDateFormat sdf = new SimpleDateFormat("yy");
				System.out.println(sdf.format(date));
				
				
			}else {
				System.out.println(file.getCanonicalPath());
				String[] list = file.list();
				for(String s : list) {
					File fs = new File(s);
					if(fs.isFile()) {
						System.out.println(s);
						
				}
				}
			}
		}
		
	}//main end
}//class end
