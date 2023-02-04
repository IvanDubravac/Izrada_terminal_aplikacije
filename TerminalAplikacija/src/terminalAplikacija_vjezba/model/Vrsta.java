package terminalAplikacija_vjezba.model;

public class Vrsta extends Entitet {

	private String naziv;
	private int predznak;

	public Vrsta() {
		super();
	}

	public Vrsta(int sifra, String naziv, int predznak) {
		super(sifra);
		this.naziv = naziv;
		this.predznak = predznak;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getPredznak() {
		return predznak;
	}

	public void setPredznak(int predznak) {
		this.predznak = predznak;
	}

}