package terminalAplikacija_vjezba;

import java.util.Scanner;

import terminalAplikacija_vjezba.Obrada.Proizvodi;
import terminalAplikacija_vjezba.Obrada.Prometi;
import terminalAplikacija_vjezba.Obrada.Vrste;
import terminalAplikacija_vjezba.Obrada.Zaposlenici;

public class Start {
		
		private Zaposlenici zaposlenici;
		private Prometi prometi;
		private Proizvodi proizvodi;
		private Vrste vrste;

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
				break;
			case 2:
				prometi.izbornik();
				break;
			case 3:
				zaposlenici.izbornik();
				break;
			case 4:
				System.out.println("DOVIĐENJA!");
				break;
				
				
			}

		}

		private void pozdravnaPoruka() {
			System.out.println("Dobrodošli u glavni izbornik!");
			System.out.println("-----------------------------");

		}
		
		
		

		public Zaposlenici getZaposlenici() {
			return zaposlenici;
		}

		public void setZaposlenici(Zaposlenici zaposlenici) {
			this.zaposlenici = zaposlenici;
		}

		public Prometi getPrometi() {
			return prometi;
		}

		public void setPrometi(Prometi prometi) {
			this.prometi = prometi;
		}

		public Vrste getVrste() {
			return vrste;
		}

		public void setVrste(Vrste vrste) {
			this.vrste = vrste;
		}

		public static void main(String[] args) {
			new Start();

		}

		public Proizvodi getProizvodi() {
			return proizvodi;
		}

		public void setProizvodi(Proizvodi proizvodi) {
			this.proizvodi = proizvodi;
		}
		
		

	}


