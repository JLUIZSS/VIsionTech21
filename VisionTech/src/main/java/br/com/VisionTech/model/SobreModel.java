package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="sobre",schema ="visiontech")
public class SobreModel implements Serializable {
private static final long serialVersionVID =1L;

@Id
@Column(name="missao")
private Integer missao;
@Column(name="visao")
private Integer visao;
@Column(name="valores")
private Integer valores;
public Integer getMissao() {
	return missao;
}
public void setMissao(Integer missao) {
	this.missao = missao;
}
public Integer getVisao() {
	return visao;
}
public void setVisao(Integer visao) {
	this.visao = visao;
}
public Integer getValores() {
	return valores;
}
public void setValores(Integer valores) {
	this.valores = valores;
}




}
