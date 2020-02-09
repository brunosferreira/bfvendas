package vendas.app;

import java.util.ArrayList;
import java.util.List;

import vendas.classes.ItemVenda;
import vendas.classes.Produto;
import vendas.classes.ProdutoPerecivel;
import vendas.classes.Venda;
import vendas.classes.ProdutoDuravel;

public class App {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto1 = new ProdutoPerecivel();
		produto1.setId(1);
		produto1.setNome("Arroz");
		produto1.setPreco(17.00);
		produtos.add(produto1);
		
		Produto produto2 = new ProdutoDuravel();
		produto2.setId(2);
		produto2.setNome("Garrafa Térmica");
		produto2.setPreco(17.00);
		produtos.add(produto2);
		
		Venda venda = new Venda();
		venda.setId(1);
		venda.setItemVenda(new ItemVenda(1, produto1, 2));
		venda.setItemVenda(new ItemVenda(2, produto2, 5));
		
		for (ItemVenda itemVenda: venda.getItensVenda()) {
			System.out.println(itemVenda.toString());
		}
		
		System.out.print(String.format("total de itens: %f, total da venda: %f", venda.getTotalItensVenda(), venda.getValorTotal()));
	}
}
