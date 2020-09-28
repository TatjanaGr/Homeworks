package lt.vtmc.tatjana.pd6;

public class PD6_1 {

	public static void main(String[] args) {
		double topLeft = 7.5 * 6.5 - 4.5 * 3;
		double topRight = 12.78;
		double bottomLeft = 47.5 - 5.5;
		double bottomRight = 15.4 - 2.75;
		double left = topLeft / bottomLeft;
		double right = topRight / bottomRight;
		boolean result = (left == right);
		System.out.println();
		System.out.println(result);

	}

}
