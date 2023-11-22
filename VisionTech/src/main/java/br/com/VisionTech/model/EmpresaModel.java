package br.com.VisionTech.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="empresa",schema ="visiotech")
public class EmpresaModel implements Serializable {
private static final long serialVersionVID =1L;

@Id
@Column(name="nome")
private Integer empresaNome;
@Column(name="CNPJ")
private Integer empresaCNPJ;
public Integer getEmpresaNome() {
	return empresaNome;
}
public void setEmpresaNome(Integer empresaNome) {
	this.empresaNome = empresaNome;
}
public Integer getEmpresaCNPJ() {
	return empresaCNPJ;
}
public void setEmpresaCNPJ(Integer empresaCNPJ) {
	this.empresaCNPJ = empresaCNPJ;
}
}
