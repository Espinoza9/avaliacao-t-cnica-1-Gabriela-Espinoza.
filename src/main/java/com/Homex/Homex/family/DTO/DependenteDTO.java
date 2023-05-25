package com.Homex.Homex.family.DTO;

public class DependenteDTO {
    private Long id;
    private int idade;
    private String nome;

    public DependenteDTO() {
    }

    public DependenteDTO(Long id, int idade , String nome) {
        this.id = id;
        this.idade = idade;
        this.nome=nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int nome) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
