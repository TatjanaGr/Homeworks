package lt.vtmc.tatjana.pd8;

public class PD8_1 {
	static double[] price = new double[6];
	static double sum = 0;

	public static void main(String[] args) {

		price[0] = 102.56;
		price[1] = 215.72;
		price[2] = 99.21;
		price[3] = 200;
		price[4] = 175.99;
		price[5] = 214.99;

		//for (double i : price) {
		//	System.out.printf("%s\n", i + "    ");
		//}

		for (int i = 0; i < price.length; i++)
			sum = sum + price[i];
		double average = sum / price.length;
		System.out.print("Vidutiniškai viena prekė kainavo  ");
		System.out.printf("%.2f", average);
		System.out.println(" Eur");
		System.out.println("Per dieną pardavė prekių už   " + sum + " Eur");

	}

}
