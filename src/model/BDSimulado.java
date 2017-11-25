package model;

import java.util.ArrayList;

import control.DocumentReaderE;
import control.DocumentReaderM;
import control.DocumentWriterE;
import control.DocumentWriterM;

public class BDSimulado {
	BDSimulado bds = new BDSimulado();
	
	ArrayList<DocumentReaderE> dre = new ArrayList<DocumentReaderE>();
	ArrayList<DocumentReaderM> drm = new ArrayList<DocumentReaderM>();
	ArrayList<DocumentWriterE> dwe = new ArrayList<DocumentWriterE>();
	ArrayList<DocumentWriterM> dwm = new ArrayList<DocumentWriterM>();
	
	
	public BDSimulado() {
		
		this.dre.addAll(dre);
		this.drm.addAll(drm);
		this.dwe.addAll(dwe);
		this.dwm.addAll(dwm);
	}
		public ArrayList<DocumentReaderE> getEsporte(){
			return this.dre;
	}
		public ArrayList<DocumentReaderM> getMedalhas(){
			return this.drm;
	}
		
		
	}
	


