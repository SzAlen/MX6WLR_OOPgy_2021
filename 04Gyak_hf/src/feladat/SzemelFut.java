package feladat;

import java.util.Scanner;

public class SzemelFut {

	public static void main(String[] args) {
		Szemely s1 = new Szemely();

		Scanner sc = new Scanner(System.in);

		int a = 0;
		String b;
		double c = 0.0;

		System.out.println("Kérem a nevet: ");
		b = sc.nextLine();

		System.out.println("Kérem a súlyt: ");
		a = sc.nextInt();

		System.out.println("Kérem a magassagot méterben: ");
		c = sc.nextDouble();

		sc.close();

		s1.setNev(b);
		s1.setMagassag(c);
		s1.setTomeg(a);

		System.out.println("Az alany Testtomeg indexe: " + s1.getTti());
		System.out.println("Az alany testi allapota: " + s1.getDagie());

		System.out.println(s1.toString());
	}
}
