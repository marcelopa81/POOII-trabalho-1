package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

abstract  public class Evento {
	protected String titulo;
    protected String descricao;
    protected LocalDate dataInicio;
    protected LocalDate dataFim;
    protected String localizacao;
    protected List<String> participantes;
    
    
	public Evento(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localizacao) throws DataInvalidaException {
		if (dataInicio.isAfter(dataFim)) {
			 throw new DataInvalidaException("Data final não menor que a data inicial");
		}
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.localizacao = localizacao;
		this.participantes = new ArrayList<String>();
	}
    
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDate getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}


	public LocalDate getDataFim() {
		return dataFim;
	}


	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public List<String> getParticipantes() {
		return participantes;
	}


	public void setParticipantes(List<String> participantes) {
		this.participantes = participantes;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(dataFim, dataInicio, descricao, localizacao, participantes, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(dataFim, other.dataFim) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(localizacao, other.localizacao)
				&& Objects.equals(participantes, other.participantes) && Objects.equals(titulo, other.titulo);
	}


	@Override
	public String toString() {
		return "Evento [titulo=" + titulo + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", localizacao=" + localizacao + ", participantes=" + participantes + "]";
	}


	public void adicionarParticipante(String participante) {
        participantes.add(participante);
    }

    public void removerParticipante(String participante) {
        participantes.remove(participante);
    }

    public void imprimirListaParticipantes() {
        for (String participante : participantes) {
            System.out.println(participante);
        }
    }
}
