package Desafio_de_codigo;

import java.util.Scanner;
import java.lang.Math;

public class regrasEKS {

	public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários
        
        double nmnodes = Math.ceil((double) numeroTotalPods/podsPorNode );
        
        int numeroMinimoNodes = (int) nmnodes;
        
        //TODO: Calcule o número mínimo de servidores necessários
        
        double nmservidores = Math.ceil((double) numeroTotalPods/podsPorServidor);
        
        int numeroMinimoServidores = (int) nmservidores;

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
    
        if(numeroMinimoNodes == 1) {
	        	System.out.println("1.Recomendamos usar um unico node");
	        }
	        else {
	        	System.out.println("1.Numero minimo de nodes:"+numeroMinimoNodes);
	        }
	        
	        System.out.println("2.Numero minimo de servidores:"+ numeroMinimoServidores);
        // Fechando o Scanner
        scanner.close();
    }
}