package terminalAplikacija_vjezba.Obrada;

import java.util.ArrayList;
import java.util.List;

import terminalAplikacija_vjezba.Pomocno;
import terminalAplikacija_vjezba.Start;
import terminalAplikacija_vjezba.model.Zaposlenik;

public class Zaposlenici {

	private List<Zaposlenik> zaposlenici;
	private Start start;

	public Zaposlenici(Start start) {
		super();
		zaposlenici = new ArrayList<>();
		this.start = start;
		testpodaci();
	}

	public Zaposlenici(List<Zaposlenik> zaposlenici, Start start) {
		super();
		this.zaposlenici = zaposlenici;
		this.start = start;
		testpodaci();
	}

	private void testpodaci() {
		zaposlenici.add(new Zaposlenik(1, "Marko", "Dubravac", "26587401254", "HR2321234232"));
		zaposlenici.add(new Zaposlenik(2, "Petar", "Perić", "43454309857", "HR232312344"));
		zaposlenici.add(new Zaposlenik(3, "Nikola", "Juzbašić", "09093847654", "HR2321345652"));
		zaposlenici.add(new Zaposlenik(4, "Dominik", "Talavanić", "11587963257", "HR5431234232"));
	}

	public List<Zaposlenik> getZaposlenici() {
		return zaposlenici;
	}

	public void setZaposlenici(List<Zaposlenik> zaposlenici) {
		this.zaposlenici = zaposlenici;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

	public void izbornik() {
		System.out.println("");
		System.out.println("Izbornik-zaposlenici");
		System.out.println("--------------------");
		System.out.println("1. Popis svih zaposlenika");
		System.out.println("2. Dodavanje novih zaposlenika");
		System.out.println("3. Promjena postojećih zaposlenika");
		System.out.println("4. Brisanje zaposlenika");
		System.out.println("5. Povratak u start menu");
		odabirIzbornik();
	}

	private void odabirIzbornik() {
		switch (Pomocno.unosBrojaURasponu("Unesite željenu opciju: ", 1, 5)) {
		case 1:
			popis(true);
			break;
		case 2:
			noviZaposlenici();
			break;
		case 3:
			if (zaposlenici.size() == 0) {
				System.out.println("Nema niti jednog zaposlenika!");
				izbornik();
			} else {
				promjenaStavki();
			}
			break;
		case 4:
			if (zaposlenici.size() == 0) {
				System.out.println("Nemate niti jednog zaposlenika!");
				izbornik();
			} else {
				brisanjeZaposlenika();
			}
			break;
		case 5:
			start.glavniIzbornik();
			System.out.println("");
		}
		

	}

	private void brisanjeZaposlenika() {
		popis(false);
		int rb=Pomocno.unosBrojaURasponu("Odaberite zaposlenika kojega bi obrisali: ", 1, zaposlenici.size());
		zaposlenici.remove(rb-1);
		izbornik();

	}

	private void promjenaStavki() {
		popis(false);
		int rb = Pomocno.unosBrojaURasponu("Odaberite zaposlenika kojega želite mjenjati: ", 1, zaposlenici.size());
		Zaposlenik z = zaposlenici.get(rb - 1);
		z.setIme(Pomocno.unosTeksta("Unesite ime: "));
		z.setPrezime(Pomocno.unosTeksta("Unesite prezime: "));
		z.setSifra(Pomocno.unosBrojaURasponu("Unesite šifru: ", 1, Integer.MAX_VALUE));
		izbornik();

	}

	private void noviZaposlenici() {
		zaposlenici.add(unesiNovogZaposlenika());
		izbornik();

	}

	private Zaposlenik unesiNovogZaposlenika() {
		Zaposlenik z = new Zaposlenik();
		z.setSifra(Pomocno.unosBrojaURasponu("Unesite šifru zaposlenika: ", 1, Integer.MAX_VALUE));
		z.setIme(Pomocno.unosTeksta("Unesite ime zaposlenika: "));
		z.setPrezime(Pomocno.unosTeksta("Unesite prezime zaposlenika: "));
		return z;
	}

	private void popis(boolean prikaziZaposlenike) {
		System.out.println("\nZaposlenici: ");
		int rb = 1;
		for (Zaposlenik z : zaposlenici) {
			System.out.println(rb++ + ". " + z);
		}
		if (prikaziZaposlenike) {
			izbornik();
		}

	}

}