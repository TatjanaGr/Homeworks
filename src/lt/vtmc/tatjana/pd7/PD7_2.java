package lt.vtmc.tatjana.pd7;

import java.util.Scanner;

public class PD7_2 {
	private static int runnerNumber = 0;
	private static Scanner getData = new Scanner(System.in);
	private static int fastRunnerTime = 100000;

	public static void main(String[] args) {
		getRunnerNumber();
		int result = getRunnerTimes();
		// System.out.println("Bėgikų laikų vidurkis " + result/runnerNumber + " s");
		System.out.println("Greičiausio bėgiko laikas:  " + fastRunnerTime + "  s");
		System.out.println("Jis buvo: " + (result / runnerNumber - fastRunnerTime) + " s geresnis už vidurkį");

	}

	public static int getRunnerTimes() {
		int result = 0;
		for (int i = 0; i < runnerNumber; i++) {
			System.out.print("Įveskite bėgiko laiką, s:   ");
			int runnerTime = getData.nextInt();
			if (runnerTime < fastRunnerTime) {
				fastRunnerTime = runnerTime;
			}
			result += runnerTime;
		}

		// System.out.println("Bendras bėgikų laikas " + result + " s");
		return result;

	}

	public static void getRunnerNumber() {
		System.out.print("Kiek dalyvavo bėgikų:   ");
		runnerNumber = getData.nextInt();

	}

}
