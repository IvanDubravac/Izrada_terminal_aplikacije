package terminalAplikacija_vjezba;

import java.util.Scanner;

import terminalAplikacija_vjezba.Obrada.Proizvodi;
import terminalAplikacija_vjezba.Obrada.Prometi;
import terminalAplikacija_vjezba.Obrada.Zaposlenici;

public class Start {
		
		private Zaposlenici zaposlenici;
		private Prometi prometi;
		private Proizvodi proizvodi;

		public Start() {
			Pomocno.ulaz = new Scanner(System.in);
			zaposlenici=new Zaposlenici(this);
			prometi=new Prometi(this);
			proizvodi=new Proizvodi(this);
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
			case 1:
				proizvodi.izbornik();
//			case 2:
//				prometi.izbornik();
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


