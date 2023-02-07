package terminalAplikacija_vjezba.Obrada;

import java.util.ArrayList;
import java.util.List;

import terminalAplikacija_vjezba.Pomocno;
import terminalAplikacija_vjezba.Start;
import terminalAplikacija_vjezba.model.Proizvod;
import java.math.BigDecimal;

public class Proizvodi {
	private Start start;
	private List<Proizvod> proizvodi;

	public Proizvodi(Start start) {
		super();
		this.start = start;
		proizvodi = new ArrayList<>();

		testproizvodi();
	}

	private void testproizvodi() {
		proizvodi.add(new Proizvod(1, "Colgate pasta za zube", new BigDecimal(1.99)));
		proizvodi.add(new Proizvod(2, "Orbit žvakaće gume", new BigDecimal(0.99)));
		proizvodi.add(new Proizvod(3, "Polubijeli kruh", new BigDecimal(1.12)));
		proizvodi.add(new Proizvod(1, "Coca-Cola zero", new BigDecimal(1.68)));

	}

	public Proizvodi(Start start, List<Proizvod> proizvodi) {
		super();
		this.start = start;
		this.proizvodi = proizvodi;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

	public List<Proizvod> getProizvodi() {
		return proizvodi;
	}

	public void setProizvodi(List<Proizvod> proizvodi) {
		this.proizvodi = proizvodi;
	}

	public void izbornik() {
		System.out.println("");
		System.out.println("Izbornik-proizvodi");
		System.out.println("--------------------");
		System.out.println("1. Popis svih proizvoda");
		System.out.println("2. Dodavanje novih proizvoda");
		System.out.println("3. Promjena postojećih proizvoda");
		System.out.println("4. Brisanje proizvoda");
		System.out.println("5. Povratak u start menu");
		odabirIzbornik();
	}

	private void odabirIzbornik() {
		switch (Pomocno.unosBrojaURasponu("Odaberite željenu opciju: ", 1, 5)) {
		case 1:
			popis(true);
		case 2:
			dodavanjeProizvoda();
			izbornik();
		case 3:
			promjenaProizvoda();
		case 4:
			brisanjeProizvoda();
		case 5:
			start.glavniIzbornik();

		}

	}

	private void brisanjeProizvoda() {
		popis(false);
		int rb=Pomocno.unosBrojaURasponu("Unesite proizvod koji bi ste brisali: ", 1, proizvodi.size());
		proizvodi.remove(rb-1);
		izbornik();
		
	}

	private void promjenaProizvoda() {
		popis(false);
		int rb=Pomocno.unosBrojaURasponu("Odaberite proizvod koji bi mijenjali: ", 1, proizvodi.size());
		Proizvod p=proizvodi.get(rb-1);
		p.setSifra(Pomocno.unosBrojaURasponu("Unesite novu šifru: ", 1, Integer.MAX_VALUE));
		p.setNaziv(Pomocno.unosTeksta("Unesite novi naziv: "));
		izbornik();
		
	}

	private void dodavanjeProizvoda() {
		proizvodi.add(dodajProizvod());
		
	}

	private Proizvod dodajProizvod() {
		Proizvod p=new Proizvod();
		p.setSifra(Pomocno.unosBrojaURasponu("Unesite šifru proizvoda: ", 1, Integer.MAX_VALUE));
		p.setNaziv(Pomocno.unosTeksta("Unesite naziv proizvoda: "));
		return p;
	}
	
	
	private void popis(boolean popisProizvoda) {
		System.out.println("\nProizvodi: ");
		int rb=1;
		for(Proizvod p : proizvodi) {
			System.out.println(rb++ +". "+ p);
		}
		if(popisProizvoda) {
			izbornik();
		}
	}

}
