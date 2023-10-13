package Desafio_de_Projeto.Padroes_de_projetos.Facade.Pedidos;

public class pedidos {
	
	private pedidos() {
		super();
	}

	public static void salvarpedido(String nome, String npedido, String lanche, String bebida, String pagamento) {
		System.out.println("O foi salvo no sistema: ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Nº pedido: " + npedido);
		System.out.println("Descrição do Lanche: " + lanche);
		System.out.println("Bebida selecionada: " + bebida);
		System.out.println("Forma de pagamento: " + pagamento);
				
		}
}
