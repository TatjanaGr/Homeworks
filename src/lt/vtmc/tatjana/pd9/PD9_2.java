package lt.vtmc.tatjana.pd9;

public class PD9_2 {
	static double[] january = new double[6];
	static double[] february = new double[6];
	static double[] march = new double[6];
	static double sumJan = 0;
	static double sumFeb = 0;
	static double sumMar = 0;

	public static void main(String[] args) {

		january[0] = -11.5;
		january[1] = -10.3;
		january[2] = -12;
		january[3] = -6.5;
		january[4] = -5;
		january[5] = -15.5;

		february[0] = -16;
		february[1] = -14.5;
		february[2] = -11;
		february[3] = -10.3;
		february[4] = -3.5;
		february[5] = 0;

		march[0] = -3;
		march[1] = -2.5;
		march[2] = -0;
		march[3] = 5;
		march[4] = 9.5;
		march[5] = 11.2;

		// System.out.println("\n" + Arrays.toString(january));
		// System.out.println("\n" + Arrays.toString(february));
		// System.out.println("\n" + Arrays.toString(march));

		for (int i = 0; i < january.length; i++)
			sumJan = sumJan + january[i];
		double averageJan = sumJan / january.length;

		System.out.print("Vidutinė sausio temperatūra: ");
		System.out.printf("%.2f", averageJan);
		System.out.println();

		for (int i = 0; i < february.length; i++)
			sumFeb = sumFeb + february[i];
		double averageFeb = sumFeb / february.length;
		System.out.print("Vidutinė vasario temperatūra: ");
		System.out.printf("%.2f", averageFeb);
		System.out.println();

		for (int i = 0; i < march.length; i++)
			sumMar = sumMar + march[i];
		double averageMar = sumMar / march.length;
		System.out.print("Vidutinė kovo temperatūra: ");
		System.out.printf("%.2f", averageMar);
		System.out.println();

		double averageJanFebMar = (sumJan + sumFeb + sumMar) / (3 * 6);
		System.out.print("Bendras atliktų matavimų vidurkis:   ");
		System.out.printf("%.2f", averageJanFebMar);

	}

}
