package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="login",schema ="visiontech")
public class LoginModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private static final long serialVersionVID =1L;

@Id

@Column(name="senha")
private String senha;
@Column(name="repitasenha")
private String repitasenha;
@Column(name="usuario")
private String usuario;
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getRepitasenha() {
	return repitasenha;
}
public void setRepitasenha(String repitasenha) {
	this.repitasenha = repitasenha;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}



}

