package lt.vtmc.tatjana.pd6;
import java.util.Scanner;

public class PD6_3 {
	static int a = 20;
	static int h = 10;
	static double price = 0.5;
	
	public static void main(String[] args) {
		Scanner dataInput = new Scanner(System.in);

		System.out.print("Sienos ilgis m: ");
		int i1 = dataInput.nextInt();
		System.out.print("Sienos aukštis m: ");
		int i2 = dataInput.nextInt();
		
		dataInput.close();

		int kiekis = i1 * i2 * 10000/ (a * h);
		System.out.println("Plytų kiekis " + kiekis);
		double suma = kiekis * price;
		System.out.println("Plytos kainuos " + suma + " Eur");
		;

	}

}
