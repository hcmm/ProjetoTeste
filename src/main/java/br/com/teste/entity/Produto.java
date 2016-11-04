package br.com.teste.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
public class Produto implements Serializable{

	private static final long serialVersionUID = 7486869689016867665L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length = 80)
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
