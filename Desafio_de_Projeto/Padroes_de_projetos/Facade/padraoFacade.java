package Desafio_de_Projeto.Padroes_de_projetos.Facade;

import Desafio_de_Projeto.Padroes_de_projetos.Facade.Bebida.bebidas;
import Desafio_de_Projeto.Padroes_de_projetos.Facade.Lanches.lanches;
import Desafio_de_Projeto.Padroes_de_projetos.Facade.Pagamento.pagamento;
import Desafio_de_Projeto.Padroes_de_projetos.Facade.Pedidos.pedidos;

public class padraoFacade {

	public void salvarpedido(String nome,String npedido) {
		String lanche = lanches.getinstancia().recuperarlanche(npedido);
		String bebida = bebidas.getinstancia().recuperarbebida(npedido);
		String pagamentos = pagamento.getinstancia().recuperarpagamento(npedido);
	
		pedidos.salvarpedido(nome, npedido, lanche, bebida, pagamentos);
		
	}
}