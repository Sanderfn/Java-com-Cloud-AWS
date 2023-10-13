package Desafio_de_Projeto.Padroes_de_projetos.Facade.Bebida;


public class bebidas {

	private static bebidas instancia = new bebidas();
	
	private bebidas() {
		super ();
	}
	
	public static bebidas getinstancia() {
		return instancia;
	}
	
	public String recuperarbebida (String npedido) {
		return "Coca cola 600 ml";
	}
	
	
}
