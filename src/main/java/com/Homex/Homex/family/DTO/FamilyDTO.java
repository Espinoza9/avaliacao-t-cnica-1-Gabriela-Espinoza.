package com.Homex.Homex.family.DTO;

import java.util.List;

import com.Homex.Homex.family.models.Dependente;

public class FamilyDTO {
    private double rendaTotal;
    private String chefeFamiliar;
    private List<Dependente> dependentes;
    private int pontuacao;

    public FamilyDTO() {
    }

    public FamilyDTO(double rendaTotal, String chefeFamiliar, List<Dependente> dependentes,int pontuacao) {
        this.rendaTotal = rendaTotal;
        this.chefeFamiliar = chefeFamiliar;
        this.dependentes = dependentes;
        this.pontuacao=pontuacao;
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal = rendaTotal;
    }

    public String getChefeFamiliar() {
        return chefeFamiliar;
    }

    public void setChefeFamiliar(String chefeFamiliar) {
        this.chefeFamiliar = chefeFamiliar;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
    public int getPontuacao(){
        return pontuacao;
    }
    public void setPontuacao(int pontuacao){
        this.pontuacao=pontuacao;
    }

}