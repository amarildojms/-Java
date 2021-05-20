package util;

public class Conversor {

	public static final double IOF = 0.06;

	public static double calc(double cotacao, double compra) {
		double total = cotacao * compra;
		return total + total * IOF;
	}

}
