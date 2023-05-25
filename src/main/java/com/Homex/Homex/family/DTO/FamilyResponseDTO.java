package com.Homex.Homex.family.DTO;

import java.util.List;

import com.Homex.Homex.family.models.Dependente;
import com.Homex.Homex.family.models.Family;

public record FamilyResponseDTO(Long id, List<Dependente> dependentes, double rendaTotal, String chefeFamiliar, int pontuacao) {
    public FamilyResponseDTO(Family family) {
        this(family.getId(), family.getDependentes(), family.getRendaTotal(), family.getChefeFamiliar(), family.getPontuacao());
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setId(Long id) {
    }

    public void setChefeFamiliar(String chefeFamiliar) {
    }

    public void setRendaTotal(double rendaTotal) {
    }

    public void setPontuacao(int pontuacao) {
    }

    public void setDependentes(List<DependenteDTO> dependenteDTO) {
    }

}