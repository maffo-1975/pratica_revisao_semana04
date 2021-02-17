package figuraGeometrica;

public class Losango {

	private static int quantidadeLinhas;

	public Losango(int quantidadeLinhas) throws LosangoException {

		if ((quantidadeLinhas >= 1 && quantidadeLinhas <= 19) && (quantidadeLinhas % 2 == 1)) {
			Losango.quantidadeLinhas = quantidadeLinhas;
		} else {
			throw new LosangoException("O número deve ser ímpar entre 1 e 19");
		}

	}

	public void exibeLosango() {

		System.out.println();

		for (int i = 1; i <= quantidadeLinhas; i += 2) {
			geraLosango(i);
		}

		for (int i = quantidadeLinhas - 2; i > 0; i -= 2) {
			geraLosango(i);
		}

	}

	private static void geraLosango(int i) {

		int k = (quantidadeLinhas - i) / 2;

		for (int j = 1; j <= k; j++) {
			System.out.print("  ");
		}

		for (int j = 1; j <= i; j++) {
			System.out.print("* ");
		}

		for (int j = 1; j <= k; j++) {
			System.out.print("  ");
		}

		System.out.println();
	}

}
