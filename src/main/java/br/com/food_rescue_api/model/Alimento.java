package br.com.food_rescue_api.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alimentos")
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String categoria;
    private Integer quantidade;
    private LocalDate validade;

    // Construtor vazio
    public Alimento() {
    }

    // Construtor completo
    public Alimento(String nome, String categoria, Integer quantidade, LocalDate validade) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
}
