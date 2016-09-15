package br.com.marcospcruz.icidades_api.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the xmlTag database table.
 * 
 */
@Entity
@Table(name="xmlTag")
@NamedQuery(name="XmlTag.findAll", query="SELECT x FROM XmlTag x")
public class XmlTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idXmlTag;

	private String dataType;

	private String descricao;

	private int idXmlTagPai;

	private String nomeTagXml;

	//bi-directional many-to-one association to MapeamentoApi_Portal_Anunciante
	@OneToMany(mappedBy="xmlTag1")
	private List<MapeamentoApi_Portal_Anunciante> mapeamentoApiPortalAnunciantes1;

	//bi-directional many-to-one association to MapeamentoApi_Portal_Anunciante
	@OneToMany(mappedBy="xmlTag2")
	private List<MapeamentoApi_Portal_Anunciante> mapeamentoApiPortalAnunciantes2;

	//bi-directional many-to-many association to XmlApiPortal
	@ManyToMany(mappedBy="xmlTags")
	private List<XmlApiPortal> xmlApiPortals;

	public XmlTag() {
	}

	public int getIdXmlTag() {
		return this.idXmlTag;
	}

	public void setIdXmlTag(int idXmlTag) {
		this.idXmlTag = idXmlTag;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdXmlTagPai() {
		return this.idXmlTagPai;
	}

	public void setIdXmlTagPai(int idXmlTagPai) {
		this.idXmlTagPai = idXmlTagPai;
	}

	public String getNomeTagXml() {
		return this.nomeTagXml;
	}

	public void setNomeTagXml(String nomeTagXml) {
		this.nomeTagXml = nomeTagXml;
	}

	public List<MapeamentoApi_Portal_Anunciante> getMapeamentoApiPortalAnunciantes1() {
		return this.mapeamentoApiPortalAnunciantes1;
	}

	public void setMapeamentoApiPortalAnunciantes1(List<MapeamentoApi_Portal_Anunciante> mapeamentoApiPortalAnunciantes1) {
		this.mapeamentoApiPortalAnunciantes1 = mapeamentoApiPortalAnunciantes1;
	}

	public MapeamentoApi_Portal_Anunciante addMapeamentoApiPortalAnunciantes1(MapeamentoApi_Portal_Anunciante mapeamentoApiPortalAnunciantes1) {
		getMapeamentoApiPortalAnunciantes1().add(mapeamentoApiPortalAnunciantes1);
		mapeamentoApiPortalAnunciantes1.setXmlTag1(this);

		return mapeamentoApiPortalAnunciantes1;
	}

	public MapeamentoApi_Portal_Anunciante removeMapeamentoApiPortalAnunciantes1(MapeamentoApi_Portal_Anunciante mapeamentoApiPortalAnunciantes1) {
		getMapeamentoApiPortalAnunciantes1().remove(mapeamentoApiPortalAnunciantes1);
		mapeamentoApiPortalAnunciantes1.setXmlTag1(null);

		return mapeamentoApiPortalAnunciantes1;
	}

	public List<MapeamentoApi_Portal_Anunciante> getMapeamentoApiPortalAnunciantes2() {
		return this.mapeamentoApiPortalAnunciantes2;
	}

	public void setMapeamentoApiPortalAnunciantes2(List<MapeamentoApi_Portal_Anunciante> mapeamentoApiPortalAnunciantes2) {
		this.mapeamentoApiPortalAnunciantes2 = mapeamentoApiPortalAnunciantes2;
	}

	public MapeamentoApi_Portal_Anunciante addMapeamentoApiPortalAnunciantes2(MapeamentoApi_Portal_Anunciante mapeamentoApiPortalAnunciantes2) {
		getMapeamentoApiPortalAnunciantes2().add(mapeamentoApiPortalAnunciantes2);
		mapeamentoApiPortalAnunciantes2.setXmlTag2(this);

		return mapeamentoApiPortalAnunciantes2;
	}

	public MapeamentoApi_Portal_Anunciante removeMapeamentoApiPortalAnunciantes2(MapeamentoApi_Portal_Anunciante mapeamentoApiPortalAnunciantes2) {
		getMapeamentoApiPortalAnunciantes2().remove(mapeamentoApiPortalAnunciantes2);
		mapeamentoApiPortalAnunciantes2.setXmlTag2(null);

		return mapeamentoApiPortalAnunciantes2;
	}

	public List<XmlApiPortal> getXmlApiPortals() {
		return this.xmlApiPortals;
	}

	public void setXmlApiPortals(List<XmlApiPortal> xmlApiPortals) {
		this.xmlApiPortals = xmlApiPortals;
	}

}