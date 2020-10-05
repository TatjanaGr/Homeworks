package lt.vtmc.tatjana.pd11;

import java.util.Arrays;

public class PD11_1 {

	public static void main(String[] args) {
		Generator11_1 generate = new Generator11_1();
		generate.generateNumbers(5);
		System.out.println(Arrays.toString(generate.generateNumbers(5)));
	}

}
