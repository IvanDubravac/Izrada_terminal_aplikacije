package terminalAplikacija_vjezba.model;

import java.math.BigDecimal;

public class Proizvod extends Entitet {
	private String naziv;
	private BigDecimal cijena;

	public Proizvod() {
		super();
	}

	public Proizvod(int sifra, String naziv, BigDecimal cijena) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public BigDecimal getCijena() {
		return cijena;
	}

	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}
	@Override
	public String toString() {
		return naziv;
	}

}
