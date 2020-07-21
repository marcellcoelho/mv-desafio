package br.com.mv.desafio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Cnes.
 */
@Entity
@Table(name = "CNES")
public class Cnes implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7059162512082339492L;

	/** The codigo. */
	@Id
	@Column(name = "CO_CNES")
	private Long codigo;

	/** The ibge. */
	@Column(name = "CO_IBGE")
	private String ibge;

	/** The nome fantasia. */
	@Column(name = "NO_FANTASIA")
	private String nomeFantasia;

	/** The tipo unidade. */
	@Column(name = "DS_TIPO_UNIDADE")
	private String tipoUnidade;

	/** The tipo gestao. */
	@Column(name = "TP_GESTAO")
	private String tipoGestao;

	/** The logradouro. */
	@Column(name = "NO_LOGRADOURO")
	private String logradouro;

	/** The numero endereco. */
	@Column(name = "NU_ENDERECO")
	private String numeroEndereco;

	/** The bairro. */
	@Column(name = "NO_BAIRRO")
	private String bairro;

	/** The cep. */
	@Column(name = "CO_CEP")
	private String cep;

	/** The uf. */
	@Column(name = "UF")
	private String uf;

	/** The municipio. */
	@Column(name = "MUNICIPIO")
	private String municipio;

	/** The telefone. */
	@Column(name = "NU_TELEFONE")
	private String telefone;
	
	/**
	 * Instantiates a new cnes.
	 */
	public Cnes() {
		super();
	}
	
	/**
	 * Instantiates a new cnes.
	 *
	 * @param tipoUnidade the tipo unidade
	 * @param tipoGestao the tipo gestao
	 * @param uf the uf
	 */
	public Cnes(String tipoUnidade, String tipoGestao, String uf) {
		super();
		this.tipoUnidade = tipoUnidade;
		this.tipoGestao = tipoGestao;
		this.uf = uf;
	}

	/**
	 * Gets the codigo.
	 *
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * Sets the codigo.
	 *
	 * @param codigo the new codigo
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * Gets the ibge.
	 *
	 * @return the ibge
	 */
	public String getIbge() {
		return ibge;
	}

	/**
	 * Sets the ibge.
	 *
	 * @param ibge the new ibge
	 */
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	/**
	 * Gets the nome fantasia.
	 *
	 * @return the nome fantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	/**
	 * Sets the nome fantasia.
	 *
	 * @param nomeFantasia the new nome fantasia
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	/**
	 * Gets the tipo unidade.
	 *
	 * @return the tipo unidade
	 */
	public String getTipoUnidade() {
		return tipoUnidade;
	}

	/**
	 * Sets the tipo unidade.
	 *
	 * @param tipoUnidade the new tipo unidade
	 */
	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	/**
	 * Gets the tipo gestao.
	 *
	 * @return the tipo gestao
	 */
	public String getTipoGestao() {
		return tipoGestao;
	}

	/**
	 * Sets the tipo gestao.
	 *
	 * @param tipoGestao the new tipo gestao
	 */
	public void setTipoGestao(String tipoGestao) {
		this.tipoGestao = tipoGestao;
	}

	/**
	 * Gets the logradouro.
	 *
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * Sets the logradouro.
	 *
	 * @param logradouro the new logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * Gets the numero endereco.
	 *
	 * @return the numero endereco
	 */
	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	/**
	 * Sets the numero endereco.
	 *
	 * @param numeroEndereco the new numero endereco
	 */
	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	/**
	 * Gets the bairro.
	 *
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Sets the bairro.
	 *
	 * @param bairro the new bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Gets the cep.
	 *
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Sets the cep.
	 *
	 * @param cep the new cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Gets the uf.
	 *
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * Sets the uf.
	 *
	 * @param uf the new uf
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * Gets the municipio.
	 *
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * Sets the municipio.
	 *
	 * @param municipio the new municipio
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * Gets the telefone.
	 *
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Sets the telefone.
	 *
	 * @param telefone the new telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
