package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		try {
			LocalDate dataInicial = LocalDate.of(2024, 02, 20);
			LocalDate dataFinal = LocalDate.of(2024, 02, 19);
			EventoUnico evento1 = new EventoUnico("Evento 1", "Descrição do evento 1", dataInicial,dataFinal, "Local 1");
		    EventoRecorrente evento2 = new EventoRecorrente("Evento 2", "Descrição do evento 2", dataInicial,dataFinal, "Local 2", new ArrayList<>());
		    EventoPeriodico evento3 = new EventoPeriodico("Evento 3", "Descrição do evento 3", dataInicial,dataFinal, "Local 3", 1, EventoPeriodico.UnidadeTempo.SEMANA);
		   
		    // Adicionando participantes
	        evento1.adicionarParticipante("João");
	        evento2.adicionarParticipante("Maria");
	        evento3.adicionarParticipante("Selma");

	        // Imprimindo lista de participantes
	        System.out.println("Participantes do Evento 1:");
	        evento1.imprimirListaParticipantes();

	        System.out.println("Participantes do Evento 2:");
	        evento2.imprimirListaParticipantes();

	        System.out.println("Participantes do Evento 3:");
	        evento3.imprimirListaParticipantes();
	        
	     // Imprimindo informações dos eventos
	        System.out.println(evento1.toString());
	        System.out.println(evento2.toString());
	        System.out.println(evento3.toString());
	        
	        // Testando métodos
	        evento1.removerParticipante("João");
	        evento2.imprimirListaParticipantes();
	        
		} catch (DataInvalidaException e) {
			System.out.println(e.getMessage());
		}
		

	       
	    }

	}


