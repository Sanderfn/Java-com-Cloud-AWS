package Desafio_de_Projeto.Padroes_de_projetos.Facade.Pagamento;

public class pagamento {

		private static pagamento instancia = new pagamento();
		
		private pagamento() {
			super ();
		}
		
		public static pagamento getinstancia() {
			return instancia;
		}
		
		public String recuperarpagamento (String npedido) {
			return "Cartão de débito";
		}
	}