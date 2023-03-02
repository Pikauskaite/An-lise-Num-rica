import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random gerador = new Random();
		double x, y, m = 0, n = 0;
		for (int i = 0; i < 1000000; i++) {
			x = gerador.nextDouble() * 2 - 1;
			y = gerador.nextDouble() * 2 - 1;
			if (x > 0 && y > 0) {
				n++;
				if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
					m++;
				}
			}
		}
		System.out.println("4m/n = " + (4 * m / n));
	}
}
