package vendas.classes;

public class ProdutoPerecivel extends Produto {

	public ProdutoPerecivel(int id, String nome, double valor) {
		super(id, nome, valor);
	}

	@Override
	public double getValor() {
		return super.getValor() + 5;
	}
}
