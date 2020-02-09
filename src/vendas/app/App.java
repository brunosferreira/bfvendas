package vendas.app;

import vendas.classes.ItemVenda;
import vendas.classes.Produto;
import vendas.classes.ProdutoPerecivel;
import vendas.classes.Venda;
import vendas.classes.ProdutoDuravel;

public class App {
	public static void main(String[] args) {
		
		Produto produto1 = new ProdutoPerecivel(1, "Arroz", 17);
		Produto produto2 = new ProdutoDuravel(2, "Garrafa Térmica", 32.50);
		
		Venda venda = new Venda(1);
		venda.setItemVenda(new ItemVenda(1, produto1, 2));
		venda.setItemVenda(new ItemVenda(2, produto2, 5));
		
		for (ItemVenda itemVenda: venda.getItensVenda()) {
			System.out.println(itemVenda.toString());
		}
		
		System.out.print(String.format("total de itens: %f, total da venda: %f", venda.getTotalItensVenda(), venda.getValorTotal()));
	}
}
