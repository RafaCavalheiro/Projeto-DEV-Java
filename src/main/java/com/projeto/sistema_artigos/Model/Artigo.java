package com.projeto.sistema_artigos.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Artigo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String nomeartigo;	

	private String descricaoartigo;

	private Boolean assinatura;

	public Integer getId() {
		return id;
	}	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeartigo() {
		return nomeartigo;
	}
	public void setNomeartigo(String nomeartigo) {
		this.nomeartigo = nomeartigo;
	}

	public String getDescricaoartigo() {
		return descricaoartigo;
	}
	public void setDescricaoartigo(String descricaoartigo) {
		this.descricaoartigo = descricaoartigo;
	}

	public Boolean getAssinatura() {
		return assinatura;
	}	
	public void setAssinatura(Boolean assinatura) {
		this.assinatura = assinatura;
	}
}