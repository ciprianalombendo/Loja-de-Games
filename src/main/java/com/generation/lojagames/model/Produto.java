package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // create table
@Table(name = "tb_produtos") // tb_produtos
public class Produto {
	
	@Id // primary key  (id)
	@GeneratedValue (strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id ;
	
	@NotBlank(message = "O atributo é obrigatório!")
    @Size(min = 5, max = 30, message = "O atributo titulo deve conter no minimo 5 e no máximo 30")
	private String nome;
	
	@NotNull(message = "O atributo descrição é obrigatório!")
	@Size(min = 10, max = 100, message = "O atributo descricão deve conter no minimo 10 e no máximo 100")
	private String descricao;
	
	@NotNull(message = "O atributo console é obrigatório!")
	@Size(min = 10, max = 50, message = "O atributo console deve conter no minimo 10 e no máximo 50")
	private String console;
	
	@NotNull(message = "O atributo quantidade é obrigatório!")
	@Size(min = 10, max = 50, message = "O atributo quantidade deve conter no minimo 10 e no máximo 50")
	private String quantidade;
	
	@NotNull(message = "O atributo preço é obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo preço deve conter no minimo 10 e no máximo 1000")
	private BigDecimal preco;
	
	@NotNull(message = "O atributo foto é obrigatório!")
	@Size(min = 320, max = 1080, message = "O atributo texto deve conter a largura mínima de 320 pixels e máximo de 1080 pixels")
	private String foto;
	
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;


}
