package vendas.classes;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private int id;
	private double valorTotal;
	private double totalItens;
	private List<ItemVenda> itensVenda;
	
	public Venda(int id) {
		this.itensVenda = new ArrayList<ItemVenda>();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getValorTotal() {
		for (ItemVenda item: itensVenda) {
			this.valorTotal += item.getValorItem();
		}
		return this.valorTotal;
	}
	
	public double getTotalItensVenda() {
		for (ItemVenda item: itensVenda) {
			this.totalItens += item.getQuantidade();
		}
		return this.totalItens;
	}
	
	public ItemVenda getItemVenda(int index) {
		return itensVenda.get(index);
	}
	
	public void setItemVenda(ItemVenda itemVenda) {
		this.itensVenda.add(itemVenda);
	}
	
	public List<ItemVenda> getItensVenda() {
		return this.itensVenda;
	}
}
