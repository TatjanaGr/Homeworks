package lt.vtmc.tatjana.pd6;
import java.util.Scanner;
public class PD6_2 {
	static int time = 45;
	public static void main(String[] args) {
		Scanner dataInput = new Scanner(System.in);
		System.out.print("Kiek paskaitų yra pirmadienį?: ");
		int i1 = dataInput.nextInt();
		System.out.print("Kiek paskaitų yra antradienį?: ");
		int i2 = dataInput.nextInt();
		System.out.print("Kiek paskaitų yra trečiadienį?: ");
		int i3 = dataInput.nextInt();
		System.out.print("Kiek paskaitų yra ketvirtadienį?: ");
		int i4 = dataInput.nextInt();
		System.out.print("Kiek paskaitų yra penktadienį?: ");
		int i5 = dataInput.nextInt();
		dataInput.close();

		int suma = i1 + i2 + i3 + i4 + i5;
		System.out.println("Paskaitų skaičius per savaitę - " + suma);
		int min = suma * time;
		System.out.println("Tai sudaro " + min + " minučių");

	}

}
