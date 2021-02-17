package programasPrincipais;

import java.util.Locale;
import java.util.Scanner;

import varejistaOnline.ListaProdutos;
import varejistaOnline.Produto;
import varejistaOnline.ProdutoException;

public class GeradorPrecoTotalVarejistaOnline {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resposta;

		do {
			System.out.print("Número do produto: ");
			int numeroProduto = sc.nextInt();

			System.out.print("Quantidade vendida do produto: ");
			int quantidadeVendida = sc.nextInt();

			try {
				ListaProdutos.adicionaProdutoVendido(new Produto(numeroProduto, quantidadeVendida));
			} catch (ProdutoException e) {
				System.out.println(e.getMessage());
				System.out.println();
			}

			System.out.print("Deseja adicionar outro produto (s/n)? ");
			resposta = sc.next().charAt(0);

			System.out.println();

		} while (resposta != 'n' && resposta != 'N');

		sc.close();

		System.out.printf("Preço total = US$ %.2f", ListaProdutos.calculaPrecoTotal());

	}
}
