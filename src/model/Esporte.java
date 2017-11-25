package model;

public class Esporte {
	private String esporte;
	private String modalidade;
	
	public String toString() {
		return "Esporte: " + this.getEsporte() + "\n" + "Modalidades: " +this.getModalidade();
	}
	public Esporte(String esporte, String modalidade) {
		super();
		this.esporte = esporte;
		this.modalidade = modalidade;
	}
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

}
