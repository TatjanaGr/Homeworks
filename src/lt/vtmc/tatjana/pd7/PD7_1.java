package lt.vtmc.tatjana.pd7;

import java.util.Scanner;

public class PD7_1 {
	private static Scanner getData = new Scanner(System.in);
	private static int treeNumber = 0;

	public static void main(String[] args) {
		getTreeNumber();
		double result = getTreeHeight();
		System.out.println("Eglutės aukščio vidurkis: " + result / treeNumber + " cm");
	}

	public static void getTreeNumber() {
		System.out.print("Kiek eglučių atvežta?   ");
		treeNumber = getData.nextInt();
	}

	public static double getTreeHeight() {
		double result = 0;
		for (int i = 0; i < treeNumber; i++) {
			System.out.print("Įveskite eglutės aukštį, cm:   ");
			double treeHeight = getData.nextDouble();
			if (treeHeight > 0) {
				result += treeHeight;
			}
		}
		// System.out.println("Bendras eglučių aukštis " + result + " cm");
		return result;
	}
}