package br.com.marcospcruz.icidades_api.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the xmlApiPortal database table.
 * 
 */
@Entity
@Table(name="xmlApiPortal")
@NamedQuery(name="XmlApiPortal.findAll", query="SELECT x FROM XmlApiPortal x")
public class XmlApiPortal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idXmlApiPortal;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAlteracao;

	private String descricao;

	private int idAnunciante;

	private String nome;

	//bi-directional many-to-one association to MapeamentoApi_Portal_Anunciante
	@OneToMany(mappedBy="xmlApiPortal1")
	private List<MapeamentoApi_Portal_Anunciante> mapeamentoApiPortalAnunciantes1;

	//bi-directional many-to-one association to MapeamentoApi_Portal_Anunciante
	@OneToMany(mappedBy="xmlApiPortal2")
	private List<MapeamentoApi_Portal_Anunciante> mapeamentoApiPortalAnunciantes2;

	//bi-directional many-to-many association to XmlTag
	@ManyToMany
	@JoinTable(
		name="xmlApiPortal_xmlTag"
		, joinColumns={
			@JoinColumn(name="idXmlApiPortal")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idXmlTag")
			}
		)
	private List<XmlTag> xmlTags;

	public XmlApiPortal() {
	}

	public int getIdXmlApiPortal() {
		return this.idXmlApiPortal;
	}

	public void setIdXmlApiPortal(int idXmlApiPortal) {
		this.idXmlApiPortal = idXmlApiPortal;
	}

	public Date getDataAlteracao() {
		return this.dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdAnunciante() {
		return this.idAnunciante;
	}

	public void setIdAnunciante(int idAnunciante) {
		this.idAnunciante = idAnunciante;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<MapeamentoApi_Portal_Anunciante> getMapeamentoApiPortalAnunciantes1() {
		return this.mapeamentoApiPortalAnunciantes1;
	}

	public void setMapeamentoApiPortalAnunciantes1(List<MapeamentoApi_Portal_Anunciante> mapeamentoApiPortalAnunciantes1) {
		this.mapeamentoApiPortalAnunciantes1 = mapeamentoApiPortalAnunciantes1;
	}

	public MapeamentoApi_Portal_Anunciante addMapeamentoApiPortalAnunciantes1(MapeamentoApi_Portal_Anunciante mapeamentoApiPortalAnunciantes1) {
		getMapeamentoApiPortalAnunciantes1().add(mapeamentoApiPortalAnunciantes1);
		mapeamentoApiPortalAnunciantes1.setXmlApiPortal1(this);

		return mapeamentoApiPortalAnunciantes1;
	}

	public MapeamentoApi_Portal_Anunciante removeMapeamentoApiPortalAnunciantes1(MapeamentoApi_Portal_Anunciante mapeamentoApiPortalAnunciantes1) {
		getMapeamentoApiPortalAnunciantes1().remove(mapeamentoApiPortalAnunciantes1);
		mapeamentoApiPortalAnunciantes1.setXmlApiPortal1(null);

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
		mapeamentoApiPortalAnunciantes2.setXmlApiPortal2(this);

		return mapeamentoApiPortalAnunciantes2;
	}

	public MapeamentoApi_Portal_Anunciante removeMapeamentoApiPortalAnunciantes2(MapeamentoApi_Portal_Anunciante mapeamentoApiPortalAnunciantes2) {
		getMapeamentoApiPortalAnunciantes2().remove(mapeamentoApiPortalAnunciantes2);
		mapeamentoApiPortalAnunciantes2.setXmlApiPortal2(null);

		return mapeamentoApiPortalAnunciantes2;
	}

	public List<XmlTag> getXmlTags() {
		return this.xmlTags;
	}

	public void setXmlTags(List<XmlTag> xmlTags) {
		this.xmlTags = xmlTags;
	}

}