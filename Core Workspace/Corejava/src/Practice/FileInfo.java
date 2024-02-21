package Practice;

import java.io.File;
import java.util.Date;

public class FileInfo {
	
	public static void main (String[] args) {
		
		//Creat object of "a.text" file.
		File f=new File("C:\\Users\\Asus\\Desktop\\IO\\package in.co.rays.IO;.txt");
		
		//check if file exists.
		
		if (f.exists()) {
			//name of file;
			System.out.println("package in.co.rays.IO;= "+f.getName());
			//path of file.
			System.out.println("Path= "+f.getAbsolutePath());
			
			//Check access permission.
			
			System.out.println("Access Permission");
			System.out.println("Writable= "+f.canWrite());
			System.out.println("Readable= "+f.canRead());
			//Check if it is a directory of a file.
			
			System.out.println("Is file= "+f.isFile());
			System.out.println("Id directory= "+f.isDirectory());
			
			//Last modified date of file/directory.
			
			Date d=new Date(f.lastModified());
			System.out.println("Date Modified= "+ d);
			
			//Length of file.
			
			long length=f.length();
			System.out.println("Length= "+length+" bytes");
			
		}else {
			System.out.println("Fiel does not exist");
		}
		
	}

}
