package com.projeto.sistema_artigos.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Usuario {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String nomeusuario;

  private String tipousuario;

  public Integer getId() {
    return id;  
  } 
  public void setId(Integer id) {
    this.id = id;
  }

  public String getNomeusuario() {
    return nomeusuario;
  }
  public void setNomeusuario(String nomeusuario) {
    this.nomeusuario = nomeusuario;
  }

  public String getTipousuario() {
    return tipousuario;
  }
  public void setTipousuario(String tipousuario) {
    this.tipousuario = tipousuario;
  }
}