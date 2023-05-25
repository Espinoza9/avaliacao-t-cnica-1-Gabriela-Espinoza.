package com.Homex.Homex.family.DTO;

import java.util.List;

import com.Homex.Homex.family.models.Dependente;

public class FamilyRequestDTO {
    private int quantidadeDeDependentes;
    private double rendaTotal;
    private String chefeFamiliar;
    private List<Dependente> dependentes;
    private int pontuacao;
    
 
  
    public FamilyRequestDTO() {
        this.quantidadeDeDependentes = quantidadeDeDependentes;
        this.rendaTotal = rendaTotal;
        this.chefeFamiliar = chefeFamiliar;
        this.dependentes = dependentes;
        this.pontuacao = pontuacao;
    }
  
    


    public int getQuantidadeDeDependentes() {
        return quantidadeDeDependentes;
    }
    
    public double getRendaTotal() {
        return rendaTotal;
    }
    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal=rendaTotal;
    }
    
    public String getChefeFamiliar() {
        return chefeFamiliar;
    }
    
    public List<Dependente> getDependentes() {
        return dependentes;
    }
  
    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
    
    public int getPontuacao() {
        return pontuacao;
    }

    
        public void setPontuacao(int pontuacao) {
        this.pontuacao=pontuacao;
        }
     

    public List<Dependente> dependentes() {
        return dependentes;
    }


}