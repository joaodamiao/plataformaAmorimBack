package br.com.muranodesign.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "pendencias_producao_aluno")
@XmlRootElement
public class PendenciasProducaoAluno implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Idpendencias_producao_aluno")
	private int IdPendenciasProducaoAluno;
	
	@OneToOne
	private Aluno aluno;
	
	@OneToOne
	private Roteiro roteiro;
	
	@Basic(optional = false)
	@Column(name = "portfolio_completo")
	private int portfolioCompleto;
	
	@Basic(optional = false)
	@Column(name = "ficha_finalizacao_completa")
	private int fichaFinalizacaoCompleta;
	
	@Basic(optional = false)
	@Column(name = "roteiro_completo")
	private int roteiroCompleto;

	public int getIdPendenciasProducaoAluno() {
		return IdPendenciasProducaoAluno;
	}

	public void setIdPendenciasProducaoAluno(int idPendenciasProducaoAluno) {
		IdPendenciasProducaoAluno = idPendenciasProducaoAluno;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Roteiro getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(Roteiro roteiro) {
		this.roteiro = roteiro;
	}

	public int getPortfolioCompleto() {
		return portfolioCompleto;
	}

	public void setPortfolioCompleto(int portfolioCompleto) {
		this.portfolioCompleto = portfolioCompleto;
	}

	public int getFichaFinalizacaoCompleta() {
		return fichaFinalizacaoCompleta;
	}

	public void setFichaFinalizacaoCompleta(int fichaFinalizacaoCompleta) {
		this.fichaFinalizacaoCompleta = fichaFinalizacaoCompleta;
	}

	public int getRoteiroCompleto() {
		return roteiroCompleto;
	}

	public void setRoteiroCompleto(int roteiroCompleto) {
		this.roteiroCompleto = roteiroCompleto;
	}
	

}
