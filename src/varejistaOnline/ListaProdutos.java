package varejistaOnline;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos {

	private static List<Produto> vendaRealizada = new ArrayList<>();

	public static void adicionaProdutoVendido(Produto produto) {
		vendaRealizada.add(produto);
	}

	public static double calculaPrecoTotal() {

		double precoProduto1 = 2.98;
		double precoProduto2 = 4.50;
		double precoProduto3 = 9.98;
		double precoProduto4 = 4.49;
		double precoProduto5 = 6.87;

		double precoTotal = 0.0;

		for (Produto produto : vendaRealizada) {

			switch (produto.getNumeroProduto()) {
			case 1:
				precoTotal += produto.getQuantidadeVendida() * precoProduto1;
				break;
			case 2:
				precoTotal += produto.getQuantidadeVendida() * precoProduto2;
				break;
			case 3:
				precoTotal += produto.getQuantidadeVendida() * precoProduto3;
				break;
			case 4:
				precoTotal += produto.getQuantidadeVendida() * precoProduto4;
				break;
			case 5:
				precoTotal += produto.getQuantidadeVendida() * precoProduto5;
				break;
			}
		}

		return precoTotal;

	}

}
