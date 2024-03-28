package entities;

import java.time.LocalDate;
import java.util.Date;

public class EventoPeriodico extends Evento{

	 public enum UnidadeTempo {
	        DIA,
	        SEMANA,
	        MES,
	        ANO
	    }

	    private int intervalo;
	    private UnidadeTempo unidadeTempo;

	    public EventoPeriodico(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localizacao, int intervalo, UnidadeTempo unidadeTempo) throws DataInvalidaException {
	        super(titulo, descricao, dataInicio, dataFim, localizacao);
	        this.intervalo = intervalo;
	        this.unidadeTempo = unidadeTempo;
	    }
}
