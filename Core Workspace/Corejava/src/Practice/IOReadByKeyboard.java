package Practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class IOReadByKeyboard {
	
	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(isr);
		
		PrintWriter pw=new PrintWriter("C:\\Users\\Asus\\Desktop\\pic1\\kamleshk.txt");
		
		String line=br.readLine();
		
		while (!line.equals("pankaj")) {
			
			pw.println(line);
			
			line=br.readLine();
		}
		
		pw.close();
		
		br.close();S
		
		
		
		
		
	}

}
