package vendas.classes;

public class ProdutoPerecivel extends Produto {
	@Override
	public double getPreco() {
		return super.getPreco() + 5;
	}
}
