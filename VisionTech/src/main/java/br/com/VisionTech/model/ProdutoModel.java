package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="produto",schema ="visiotech")
public class ProdutoModel implements Serializable {
private static final long serialVersionVID =1L;

@Id

@Column(name="nome")
private String senha;
@Column(name="descricao")
private String descricao;
@Column(name="preco")
private Integer preco;
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Integer getPreco() {
	return preco;
}
public void setPreco(Integer preco) {
	this.preco = preco;
}
}
