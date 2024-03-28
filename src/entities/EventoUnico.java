package entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class EventoUnico extends Evento{

	public EventoUnico(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localizacao) throws DataInvalidaException {
		super(titulo, descricao, dataInicio, dataFim, localizacao);
	}

	 @Override
	    public String toString() {
	        return "Evento único: " + titulo + "\n"
	                + "Descrição: " + descricao + "\n"
	                + "Data de início: " + dataInicio + "\n"
	                + "Data de fim: " + dataFim + "\n"
	                + "Localização: " + localizacao + "\n";
	    }

	
}
