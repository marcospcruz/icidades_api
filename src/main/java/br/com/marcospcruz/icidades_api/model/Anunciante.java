package br.com.marcospcruz.icidades_api.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "anunciantes")
@NamedQuery(name = "Anunciante.findAll", query = "select a from Anunciante a left join fetch a.agendamentos")
public class Anunciante implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(targetEntity = AgendamentoXml.class)
	@JoinColumn(name = "fk_anunciante", insertable = false, updatable = false)
	private List<AgendamentoXml> agendamentos;

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<AgendamentoXml> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<AgendamentoXml> agendamentos) {
		this.agendamentos = agendamentos;
	}

	@Override
	public String toString() {
		return "Anunciante [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Anunciante))
			return false;
		Anunciante other = (Anunciante) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
