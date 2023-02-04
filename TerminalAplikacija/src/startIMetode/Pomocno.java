package startIMetode;

import java.util.Scanner;

public class Pomocno {
	public static Scanner ulaz;

	public static int unosBrojaURasponu(String poruka, int min, int max) {
		int i;
		while (true) {
			try {
				System.out.print(poruka);
				i = Integer.parseInt(ulaz.nextLine());
				if (i < min || i > max) {
					System.out.println("Broj mora biti između " + min + " i " + max+"!");
					continue;
				}
				return i;

			} catch (Exception e) {
				System.out.println("Niste unjeli broj!");

			}
		}
	}

}
