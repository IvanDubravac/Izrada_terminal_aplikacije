package terminalAplikacija_vjezba.Obrada;

import java.util.ArrayList;
import java.util.List;

import terminalAplikacija_vjezba.Pomocno;
import terminalAplikacija_vjezba.Start;

import terminalAplikacija_vjezba.model.Promet;
import terminalAplikacija_vjezba.model.Vrsta;


public class Prometi {

	private Start start;
	private List<Promet> prometi;
	

	public Prometi(Start start) {
		super();
		prometi = new ArrayList<>();
		this.start = start;

	}

	public Prometi(Start start, List<Promet> prometi) {
		super();
		this.start = start;
		this.prometi = prometi;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

	public List<Promet> getPrometi() {
		return prometi;
	}

	public void setPrometi(List<Promet> prometi) {
		this.prometi = prometi;
	}

	public void izbornik() {
		System.out.println("");
		System.out.println("Izbornik-promet");
		System.out.println("1. Skladište");
		System.out.println("2. Doprema robe");
		System.out.println("3. Odprema robe");
		System.out.println("4. Izlaz iz programa");
		odabirIzbornik();

	}

	private void odabirIzbornik() {
		switch (Pomocno.unosBrojaURasponu("Unesite željenu opciju: ", 1, 3)) {
		case 1:
			prikazStanja(true);
			break;
		case 2:
			dopremaRobe();
			break;
		}

	}

	private void dopremaRobe() {
		Promet p=new Promet();
		p.setSifra(Pomocno.unosBrojaURasponu("Unesite šifru prometa: ", 1, Integer.MAX_VALUE));
		start.getProizvodi().popis(false);
		int rb1=Pomocno.unosBrojaURasponu("Unesite proizvod koji želite dopremiti u skladište: ", 1, start.getProizvodi().getProizvodi().size());
		p.setProizvodi(start.getProizvodi().getProizvodi().get(rb1-1));
		start.getZaposlenici().popis(false);
		int rb2=Pomocno.unosBrojaURasponu("Koji zaposlenik je obavio dopremu proizvoda u skladište: ", 1, start.getZaposlenici().getZaposlenici().size());
		p.setProizvodi(start.getProizvodi().getProizvodi().get(rb2-1));
		
		
		prometi.add(p);
		izbornik();
		
		
		
		
		
	}

	private void prikazStanja(boolean stanje) {
		int rb=1;
		for(Promet p: prometi) {
			System.out.println(rb++ +". "+p);
		}
		if(stanje) {
			izbornik();
		}
		
	}

}
