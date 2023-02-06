package terminalAplikacija_vjezba;

import java.util.Scanner;

import terminalAplikacija_vjezba.Obrada.Zaposlenici;
import terminalAplikacija_vjezba.model.Promet;

public class Start {
		
		private Zaposlenici zaposlenici;
		private Promet promet;

		public Start() {
			Pomocno.ulaz = new Scanner(System.in);
			zaposlenici=new Zaposlenici(this);
			promet=new Promet(this);
			pozdravnaPoruka();
			glavniIzbornik();
		}

		public void glavniIzbornik() {
			System.out.println("");
			System.out.println("GLAVNI IZBORNIK: ");
			System.out.println("1. Proizvodi");
			System.out.println("2. Promet");
			System.out.println("3. Zaposlenici");
			System.out.println("4. Izlaz iz programa");
			odabirGlavnogIzbornika();

		}

		private void odabirGlavnogIzbornika() {
			switch (Pomocno.unosBrojaURasponu("Odabrana opcija:", 1, 4)) {
			case 2:
				
			case 3:
				zaposlenici.izbornik();
				break;
			
			case 4:
				System.out.println("DOVIĐENJA!");
				
				
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


