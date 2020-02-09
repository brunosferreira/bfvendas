package vendas.classes;

public class ItemVenda {
	private int id;
	private Produto produto;
	private double valorVenda;
	private double quantidade;
	
	public ItemVenda() {
		
	}
	
	public ItemVenda(int id, Produto produto, double quantidade) {
		this.id = id;
		this.produto = produto;
		this.valorVenda = produto.getValor();
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
		this.valorVenda = this.produto.getValor();
	}
	
	public double getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorItem() {
		return this.quantidade * this.valorVenda;
	}
	
	@Override
	public String toString() {
		return String.format("produto: %s, preço: %f, quantidade: %f, total: %f",
				this.produto.getNome(), this.valorVenda, this.quantidade, this.getValorItem());
	}
}
