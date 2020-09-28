package lt.vtmc.tatjana.pd6;
import java.util.Scanner;
public class PD6_4 {

	public static void main(String[] args) {
		Scanner dataInput = new Scanner(System.in);

		System.out.print("Kiek telpa puodelių į dežę: ");
		int i = dataInput.nextInt();
		System.out.print("Kiek turime puodelių: ");
		int m = dataInput.nextInt();		
		dataInput.close();
		
		int boxAmount = m/i;
		System.out.println("Pilnų dežučių skaičius:  " + boxAmount);
		System.out.println("Nesupakuotų puodelių skaičius: " + m % i);
		;

	}

}
