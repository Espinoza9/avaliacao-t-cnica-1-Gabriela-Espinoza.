package com.Homex.Homex.family.models;

import java.util.ArrayList;
import java.util.List;

import com.Homex.Homex.family.DTO.FamilyRequestDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="family")
@Entity(name="family")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Family {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id 
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "family")
    private List<Dependente> dependentes;
    private double rendaTotal;
    private String chefeFamiliar ;
    private int pontuacao;

    public Family(FamilyRequestDTO data){
        this.dependentes = data.dependentes();
        this.rendaTotal = data.getRendaTotal();
        this.chefeFamiliar = data.getChefeFamiliar();
        this.pontuacao = data.getPontuacao();
    }



    public void adicionarDependente(List<Dependente> dependente){
        this.dependentes.addAll(dependente);
    }

    


    public List<Dependente> getDependentes() {
        return dependentes;
    }



    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal=rendaTotal;
    }



    public void setChefeFamiliar(String chefeFamiliar) {
        this.chefeFamiliar=chefeFamiliar;
    }



    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes=dependentes;
    }



    public void setPontuacao(int pontuacao) {
        this.pontuacao=pontuacao;
    }



    
}


