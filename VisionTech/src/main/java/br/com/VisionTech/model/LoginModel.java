package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="login",schema ="visiotech")
public class LoginModel implements Serializable {
private static final long serialVersionVID =1L;

@Id

@Column(name="senha")
private Integer senha;
@Column(name="repitasenha")
private Integer repitasenha;
@Column(name="usuario")
private Integer usuario;

public Integer getSenha() {
	return senha;
}
public void setSenha(Integer senha) {
	this.senha = senha;
}
public Integer getRepitasenha() {
	return repitasenha;
}
public void setRepitasenha(Integer repitasenha) {
	this.repitasenha = repitasenha;
}
public Integer getUsuario() {
	return usuario;
}
public void setUsuario(Integer usuario) {
	this.usuario = usuario;
}



}

