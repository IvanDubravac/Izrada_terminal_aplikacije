package model;

import java.math.BigDecimal;
import java.util.Date;

public class Proizvod extends Entitet {
	private String naziv;
	private BigDecimal cijena;
	private Date rokTrajanja;
	private String zemljePodrijetla;
	private int netoKolicina;

	public Proizvod() {
		super();
	}

	public Proizvod(int sifra, String naziv, BigDecimal cijena, Date rokTrajanja, String zemljePodrijetla,
			int netoKolicina) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
		this.rokTrajanja = rokTrajanja;
		this.zemljePodrijetla = zemljePodrijetla;
		this.netoKolicina = netoKolicina;
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

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	public String getZemljePodrijetla() {
		return zemljePodrijetla;
	}

	public void setZemljePodrijetla(String zemljePodrijetla) {
		this.zemljePodrijetla = zemljePodrijetla;
	}

	public int getNetoKolicina() {
		return netoKolicina;
	}

	public void setNetoKolicina(int netoKolicina) {
		this.netoKolicina = netoKolicina;
	}

}
