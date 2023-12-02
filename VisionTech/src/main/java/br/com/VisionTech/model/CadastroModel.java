package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="cadastro",schema ="visiontech")
public class CadastroModel implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private static final long serialVersionVID =1L;

@Id
@Column(name="nome")
private String nome;
@Column(name="email")
private String email;
@Column(name="senha")
private String senha;
@Column(name="usuario")
private String usuario;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}




}

