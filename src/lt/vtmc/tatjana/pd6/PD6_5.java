package lt.vtmc.tatjana.pd6;

import java.util.Scanner;

public class PD6_5 {

	public static void main(String[] args) {
		Scanner dataInput = new Scanner(System.in);

		System.out.print("Koks tunelio ilgis, m: ");
		int m = dataInput.nextInt();

		System.out.print("Koks automobilio greitis, km/h: ");
		double v = dataInput.nextInt();

		dataInput.close();

		double time = (3600 * m / 1000) / v;
		System.out.print("Automobilis tunelį pravažiuos per ");
		System.out.printf("%.2f", time);
		System.out.print(" s");

	}

}
