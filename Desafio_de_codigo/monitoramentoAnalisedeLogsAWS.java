package Desafio_de_codigo;

import java.util.*;

public class monitoramentoAnalisedeLogsAWS {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int quantidadeLogs = scanner.nextInt();
	        scanner.nextLine(); // Limpar o buffer do scanner

	        Map<String, Long> eventosPorServico = new HashMap<>();
	        for (int i = 0; i < quantidadeLogs; i++) {
	            String[] parts = scanner.nextLine().split(",");
	            String servico = parts[1];
	            if(eventosPorServico.containsKey(servico)) {
	              
	              eventosPorServico.put(servico, eventosPorServico.get(servico) + 1);
	              
	              } else {
	                
	                eventosPorServico.put(servico, 1L);
	              }
	            
	            Optional<Map.Entry<String, Long>> servicoComMaisLogs = eventosPorServico.entrySet()
	              .stream()
	              .max(Map.Entry.comparingByValue());
	              
	            Optional<Map.Entry<String, Long>> servicoComMenosLogs = eventosPorServico.entrySet()
	              .stream()
	              .min(Map.Entry.comparingByValue());
	              
	            if (servicoComMaisLogs.isPresent()){
	              
	              System.out.println("Maior número de logs: " + servicoComMaisLogs.get().getKey());
	              
	            }
	              
	            if (servicoComMenosLogs.isPresent()){
	              
	              System.out.println("Menos número de logs: " + servicoComMaisLogs.get().getKey());
	              
	            }
	            
	            scanner.close();
	            
	            
	            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
	        }

	        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
	        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.

	        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
	 }
}
