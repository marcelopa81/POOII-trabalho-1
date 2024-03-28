package entities;

import java.time.LocalDate;
import java.util.List;

public class EventoRecorrente extends Evento {

	private List<DiaSemana> diasSemana;

	public EventoRecorrente(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localizacao,
			List<String> participantes) throws DataInvalidaException {
		super(titulo, descricao, dataInicio, dataFim, localizacao);
		this.diasSemana = diasSemana;
	}

}
