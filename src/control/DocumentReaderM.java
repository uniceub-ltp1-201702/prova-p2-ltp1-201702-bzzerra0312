package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DocumentReaderM {
	
	public ArrayList<String> read(String medalhas) {
		
		ArrayList<String> fileLines = new ArrayList<String>();
		
		try {

			FileReader fr = new FileReader(medalhas);

			BufferedReader br = new BufferedReader(fr);
		
			String line = br.readLine();
			
			while(line != null) {
			
				fileLines.add(line);
				
				line = br.readLine();
			}
		
			br.close();
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fileLines;
	}
}
