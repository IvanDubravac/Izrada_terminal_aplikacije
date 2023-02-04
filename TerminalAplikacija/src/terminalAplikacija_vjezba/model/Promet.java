package terminalAplikacija_vjezba.model;

import java.math.BigDecimal;
import java.util.Date;

public class Promet extends Entitet {
	private Proizvod proizvodi;
	private BigDecimal kolicina;
	private Date vrijeme;
	private Zaposlenik zaposlenik;
	private Vrsta vrsta;

	public Promet() {
		super();
	}

	public Promet(int sifra, Proizvod proizvodi, BigDecimal kolicina, Date vrijeme, Zaposlenik zaposlenik,
			Vrsta vrsta) {
		super(sifra);
		this.proizvodi = proizvodi;
		this.kolicina = kolicina;
		this.vrijeme = vrijeme;
		this.zaposlenik = zaposlenik;
		this.vrsta = vrsta;
	}

	public Proizvod getProizvodi() {
		return proizvodi;
	}

	public void setProizvodi(Proizvod proizvodi) {
		this.proizvodi = proizvodi;
	}

	public BigDecimal getKolicina() {
		return kolicina;
	}

	public void setKolicina(BigDecimal kolicina) {
		this.kolicina = kolicina;
	}

	public Date getVrijeme() {
		return vrijeme;
	}

	public void setVrijeme(Date vrijeme) {
		this.vrijeme = vrijeme;
	}

	public Zaposlenik getZaposlenik() {
		return zaposlenik;
	}

	public void setZaposlenik(Zaposlenik zaposlenik) {
		this.zaposlenik = zaposlenik;
	}

	public Vrsta getVrsta() {
		return vrsta;
	}

	public void setVrsta(Vrsta vrsta) {
		this.vrsta = vrsta;
	}

}
