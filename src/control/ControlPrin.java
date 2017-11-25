package control;

import model.BDSimulado;

public class ControlPrin {
	public ControlPrin(String ViewPrin) {
		BDSimulado bds = new BDSimulado();
		DocumentReaderE DRE = new DocumentReaderE(bds);
		DocumentReaderM DRM = new DocumentReaderM(bds);
		DocumentWriterE DWE = new DocumentWriterE(bds);
		DocumentWriterM DWM = new DocumentWriterM(bds);
		
		
	}

}
