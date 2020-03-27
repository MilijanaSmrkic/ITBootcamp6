package izuzeci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Izuzeci {
	public static int ucitajInt() {

		try {
			Scanner sc = new Scanner(System.in);
			int b = sc.nextInt();

			int[] niz = new int[3];
			niz[1] = 20;
			niz[2] = 2;
			niz[0] = 6;

			System.out.println(niz[niz.length]);

			return b;
		}

		catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("Pogresan tip podataka je unet.");
			System.out.println("Molimo vas da unesete ceo broj!");

		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Nedozvoljene granice niza....");

		} catch (Exception e3) {
			System.out.println("...");
		} finally {
			System.out.println("Ovo se uvek ispisuje");

		}

		return -1;

	}

	public static void main(String[] args) {

		System.out.println("Unesite jedan ceo broj:");
		int broj = ucitajInt();
		System.out.println("Broj je: " + broj);

	}

}
