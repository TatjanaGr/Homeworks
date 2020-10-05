package lt.vtmc.tatjana.pd11;

public class Generator11_1 {

	private int[] goodNumbers;

	public int[] generateNumbers(int arraySize) {
		this.goodNumbers = new int[arraySize];
		for (int i = 0; i < goodNumbers.length; i++) {
			goodNumbers[i] = (int) (Math.random() * (100)); // galima su Random klasė

		}
		return goodNumbers;
	}
}