package br.com.marcospcruz.icidades_api.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;

/**
 * The persistent class for the agendamentoxml database table.
 * 
 */
@Entity
@Table(name = "agendamentoxml")
@NamedQuery(name = "Agendamentoxml.findAll", query = "SELECT a FROM AgendamentoXml a")
public class AgendamentoXml implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "criado_em")
	private Timestamp criadoEm;

	@Column(name = "em_processo")
	private int emProcesso;

	private String empresa;

	@Column(name = "fk_anunciante")
	private int fkAnunciante;

	@Column(name = "fk_usuario_anunciante")
	private int fkUsuarioAnunciante;

	@Column(name = "processado_em")
	private Timestamp processadoEm;

	@Column(name = "processado_ok")
	private int processadoOk;

	@Column(name = "total_imoveis")
	private int totalImoveis;

	@Lob
	private String url;

	public AgendamentoXml() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Timestamp criadoEm) {
		this.criadoEm = criadoEm;
	}

	public int getEmProcesso() {
		return this.emProcesso;
	}

	public void setEmProcesso(int emProcesso) {
		this.emProcesso = emProcesso;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getFkAnunciante() {
		return this.fkAnunciante;
	}

	public void setFkAnunciante(int fkAnunciante) {
		this.fkAnunciante = fkAnunciante;
	}

	public int getFkUsuarioAnunciante() {
		return this.fkUsuarioAnunciante;
	}

	public void setFkUsuarioAnunciante(int fkUsuarioAnunciante) {
		this.fkUsuarioAnunciante = fkUsuarioAnunciante;
	}

	public Timestamp getProcessadoEm() {
		return this.processadoEm;
	}

	public void setProcessadoEm(Timestamp processadoEm) {
		this.processadoEm = processadoEm;
	}

	public int getProcessadoOk() {
		return this.processadoOk;
	}

	public void setProcessadoOk(int processadoOk) {
		this.processadoOk = processadoOk;
	}

	public int getTotalImoveis() {
		return this.totalImoveis;
	}

	public void setTotalImoveis(int totalImoveis) {
		this.totalImoveis = totalImoveis;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "AgendamentoXml [id=" + id + ", criadoEm=" + criadoEm
				+ ", emProcesso=" + emProcesso + ", empresa=" + empresa
				+ ", fkAnunciante=" + fkAnunciante + ", fkUsuarioAnunciante="
				+ fkUsuarioAnunciante + ", processadoEm=" + processadoEm
				+ ", processadoOk=" + processadoOk + ", totalImoveis="
				+ totalImoveis + ", url=" + url + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((criadoEm == null) ? 0 : criadoEm.hashCode());
		result = prime * result + emProcesso;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + fkAnunciante;
		result = prime * result + fkUsuarioAnunciante;
		result = prime * result + id;
		result = prime * result
				+ ((processadoEm == null) ? 0 : processadoEm.hashCode());
		result = prime * result + processadoOk;
		result = prime * result + totalImoveis;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AgendamentoXml))
			return false;
		AgendamentoXml other = (AgendamentoXml) obj;
		if (criadoEm == null) {
			if (other.criadoEm != null)
				return false;
		} else if (!criadoEm.equals(other.criadoEm))
			return false;
		if (emProcesso != other.emProcesso)
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (fkAnunciante != other.fkAnunciante)
			return false;
		if (fkUsuarioAnunciante != other.fkUsuarioAnunciante)
			return false;
		if (id != other.id)
			return false;
		if (processadoEm == null) {
			if (other.processadoEm != null)
				return false;
		} else if (!processadoEm.equals(other.processadoEm))
			return false;
		if (processadoOk != other.processadoOk)
			return false;
		if (totalImoveis != other.totalImoveis)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

}