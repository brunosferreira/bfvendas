package vendas.classes;

public class ItemVenda {
	private int id;
	private Produto produto;
	private double quantidade;
	
	public ItemVenda() {
		
	}
	
	public ItemVenda(int id, Produto produto, double quantidade) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return this.quantidade * this.produto.getPreco();
	}
	
	@Override
	public String toString() {
		return String.format("produto: %s, preço: %f, quantidade: %f, total: %f",
				this.produto.getNome(), this.produto.getPreco(), this.quantidade, this.getValor());
	}
}
