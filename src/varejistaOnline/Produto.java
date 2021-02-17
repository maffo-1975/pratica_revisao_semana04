package varejistaOnline;

public class Produto {

	private Integer numeroProduto;
	private Integer quantidadeVendida;

	public Produto(Integer numeroProduto, Integer quantidadeVendida) throws ProdutoException {

		if (numeroProduto >= 1 && numeroProduto <= 5) {
			this.numeroProduto = numeroProduto;
			this.quantidadeVendida = quantidadeVendida;
		} else {
			throw new ProdutoException("Número de produto inexistente");
		}

	}

	public Integer getNumeroProduto() {
		return numeroProduto;
	}

	public Integer getQuantidadeVendida() {
		return quantidadeVendida;
	}

}
