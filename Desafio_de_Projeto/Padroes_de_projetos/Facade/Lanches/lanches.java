package Desafio_de_Projeto.Padroes_de_projetos.Facade.Lanches;

public class lanches {

	private static lanches instancia = new lanches();
	
	private lanches() {
		super ();
	}
	
	public static lanches getinstancia() {
		return instancia;
	}
	
	public String recuperarlanche (String npedido) {
		return "Xtudo Gourmet";
	}
	
	}
