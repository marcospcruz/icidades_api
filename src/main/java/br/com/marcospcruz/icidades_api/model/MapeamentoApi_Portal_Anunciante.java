package br.com.marcospcruz.icidades_api.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mapeamentoApi_Portal_Anunciante database table.
 * 
 */
@Entity
@Table(name="mapeamentoApi_Portal_Anunciante")
@NamedQuery(name="MapeamentoApi_Portal_Anunciante.findAll", query="SELECT m FROM MapeamentoApi_Portal_Anunciante m")
public class MapeamentoApi_Portal_Anunciante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMapeamentoApiPortalAnunciante;

	//bi-directional many-to-one association to XmlApiPortal
	@ManyToOne
	@JoinColumn(name="idXmlApiAnunciante")
	private XmlApiPortal xmlApiPortal1;

	//bi-directional many-to-one association to XmlApiPortal
	@ManyToOne
	@JoinColumn(name="idXmlApiPortal")
	private XmlApiPortal xmlApiPortal2;

	//bi-directional many-to-one association to XmlTag
	@ManyToOne
	@JoinColumn(name="idXmlTagApiAnunciante")
	private XmlTag xmlTag1;

	//bi-directional many-to-one association to XmlTag
	@ManyToOne
	@JoinColumn(name="idXmlTagApiPortal")
	private XmlTag xmlTag2;

	public MapeamentoApi_Portal_Anunciante() {
	}

	public int getIdMapeamentoApiPortalAnunciante() {
		return this.idMapeamentoApiPortalAnunciante;
	}

	public void setIdMapeamentoApiPortalAnunciante(int idMapeamentoApiPortalAnunciante) {
		this.idMapeamentoApiPortalAnunciante = idMapeamentoApiPortalAnunciante;
	}

	public XmlApiPortal getXmlApiPortal1() {
		return this.xmlApiPortal1;
	}

	public void setXmlApiPortal1(XmlApiPortal xmlApiPortal1) {
		this.xmlApiPortal1 = xmlApiPortal1;
	}

	public XmlApiPortal getXmlApiPortal2() {
		return this.xmlApiPortal2;
	}

	public void setXmlApiPortal2(XmlApiPortal xmlApiPortal2) {
		this.xmlApiPortal2 = xmlApiPortal2;
	}

	public XmlTag getXmlTag1() {
		return this.xmlTag1;
	}

	public void setXmlTag1(XmlTag xmlTag1) {
		this.xmlTag1 = xmlTag1;
	}

	public XmlTag getXmlTag2() {
		return this.xmlTag2;
	}

	public void setXmlTag2(XmlTag xmlTag2) {
		this.xmlTag2 = xmlTag2;
	}

}