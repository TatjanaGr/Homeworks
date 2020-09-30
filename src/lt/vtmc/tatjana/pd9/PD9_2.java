package lt.vtmc.tatjana.pd9;

public class PD9_2 {
	static double[] january = {-11.5, -10.3, -12, -6.5, -5, -15.5};
	static double[] february = {-16, -14.5, -11, -10.3, -3.5, 0};
	static double[] march = {-3, -2.5, 0, 5, 9.5, 11.2};
	static double sumJan = 0;
	static double sumFeb = 0;
	static double sumMar = 0;

	public static void main(String[] args) {

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
