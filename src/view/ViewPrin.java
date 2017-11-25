package view;


import javax.swing.JOptionPane;

public class ViewPrin {
	public String ViewPrin(String ViewEsporte, String ViewMedalhas) {
	     String[] options = {"Esporte", "Medalhas"};
	     int r = JOptionPane.showOptionDialog(null, "Escolha uma opção",
	    		 "Quadro de País e Medalhas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
	     if (r==0) {
	    	 return ViewEsporte;
	     }
	     if (r==1) {
	    	 return ViewMedalhas;
			
		}
		return null;
		
			
		}
}

