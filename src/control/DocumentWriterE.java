package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DocumentWriterE {

	
	public void write(String esportes, String Esporte) {
		try {
			//Cria o FileWriter para escrever no arquivo
			FileWriter fw = new FileWriter(esportes, true);
			//Cria um PrintWriter para escrever no arquivo
			PrintWriter pw = new PrintWriter(fw);
			//Escreve a linha no arquivo e pula para a próxima linha
			pw.println(Esporte);
			//Fecha o PrintWriter
			pw.close();			
		
		//Erro de acesso IO
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
