package startIMetode;

import java.util.Scanner;

import obrada.Zaposlenici;

public class Start {
	
	private Zaposlenici zaposlenici;

	public Start() {
		Pomocno.ulaz = new Scanner(System.in);
		zaposlenici=new Zaposlenici(this);
		pozdravnaPoruka();
		glavniIzbornik();
	}

	public void glavniIzbornik() {
		System.out.println("GLAVNI IZBORNIK: ");
		System.out.println("1. Proizvodi");
		System.out.println("2. Promet");
		System.out.println("3. Zaposlenici");
		System.out.println("4. Izlaz iz programa");
		odabirGlavnogIzbornika();

	}

	private void odabirGlavnogIzbornika() {
		switch (Pomocno.unosBrojaURasponu("Odabrana opcija:", 1, 4)) {
		case 3:
			
		
		case 4:
			System.out.println("Doviđenja!");
			
		}

	}

	private void pozdravnaPoruka() {
		System.out.println("Dobrodošli u glavni izbornik!");
		System.out.println("-----------------------------");

	}

	public static void main(String[] args) {
		
		new Start();
	}

}
