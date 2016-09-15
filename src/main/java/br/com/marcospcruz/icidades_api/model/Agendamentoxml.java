package br.com.marcospcruz.icidades_api.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the agendamentoxml database table.
 * 
 */
@Entity
@Table(name="agendamentoxml")
@NamedQuery(name="Agendamentoxml.findAll", query="SELECT a FROM Agendamentoxml a")
public class Agendamentoxml implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="criado_em")
	private Timestamp criadoEm;

	@Column(name="em_processo")
	private int emProcesso;

	private String empresa;

	@Column(name="fk_anunciante")
	private int fkAnunciante;

	@Column(name="fk_usuario_anunciante")
	private int fkUsuarioAnunciante;

	@Column(name="processado_em")
	private Timestamp processadoEm;

	@Column(name="processado_ok")
	private int processadoOk;

	@Column(name="total_imoveis")
	private int totalImoveis;

	@Lob
	private String url;

	public Agendamentoxml() {
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

}