package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="contato",schema ="visiontech")
public class ContatoModel implements Serializable {
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
@Column(name="assunto")
private String assunto;
@Column(name="mensagem")
private String mensagem;
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
public String getAssunto() {
	return assunto;
}
public void setAssunto(String assunto) {
	this.assunto = assunto;
}
public String getMensagem() {
	return mensagem;
}
public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
}




}