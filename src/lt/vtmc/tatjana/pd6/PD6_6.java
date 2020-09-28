package lt.vtmc.tatjana.pd6;

import java.util.Scanner;

public class PD6_6 {

	public static void main(String[] args) {

		Scanner dataInput = new Scanner(System.in);

		System.out.print("Kiek žuvų gyvena akvariume? ");
		int a = dataInput.nextInt();

		System.out.print("Kiek žuvų į akvariumą įdedama kiekvieną dieną? ");
		int b = dataInput.nextInt();

		System.out.print("Kiek dienų praėjo? ");
		int n = dataInput.nextInt();

		dataInput.close();

		int result = a + b * n;
		System.out.println("Po " + n + " dienų akvariume gyvens " + result + " žuvų.");

	}

}
