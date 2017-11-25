package model;

public class Medalhas {
	private String pais;
	private int MOuro;
	private int MPrata;
	private int MBronze;
	private int PRanking;
	
	public String toStringMedalhas() {
		return "País: " +this.getPais()+"Total de medalhas de ouro: "+this.getMOuro()+"Total de medalhas de prata: "+
	this.getMPrata()+"Total de medalhas de bronze: "+this.getMBronze();
	}
	public Medalhas(String pais, int mOuro, int mPrata, int mBronze, int pRanking) {
		super();
		this.pais = pais;
		MOuro = mOuro;
		MPrata = mPrata;
		MBronze = mBronze;
		PRanking = pRanking;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getMOuro() {
		return MOuro;
	}
	public void setMOuro(int mOuro) {
		MOuro = mOuro;
	}
	public int getMPrata() {
		return MPrata;
	}
	public void setMPrata(int mPrata) {
		MPrata = mPrata;
	}
	public int getMBronze() {
		return MBronze;
	}
	public void setMBronze(int mBronze) {
		MBronze = mBronze;
	}
	public int getPRanking() {
		return PRanking;
	}
	public void setPRanking(int pRanking) {
		PRanking = pRanking;
	}

}
