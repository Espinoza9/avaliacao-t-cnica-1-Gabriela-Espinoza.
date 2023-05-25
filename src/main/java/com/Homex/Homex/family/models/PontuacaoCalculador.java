package com.Homex.Homex.family.models;

import java.util.List;

import com.Homex.Homex.family.DTO.FamilyRequestDTO;

public class PontuacaoCalculador {
    public int calcularPontuacao(FamilyRequestDTO familyDTO) {
        double rendaTotal = familyDTO.getRendaTotal();
        List<Dependente> dependentes = familyDTO.getDependentes();

        int pontosRendaTotal = (rendaTotal <= 900) ? 5 : (rendaTotal <= 1500) ? 3 : 0;

        int quantidadeDependentes = (int) dependentes.stream()
                .filter(dependente -> dependente.getIdade() < 18)
                .count();

        int pontosDependentes = (quantidadeDependentes >= 3) ? 3 : (quantidadeDependentes >= 1 && quantidadeDependentes <= 2) ? 2 : 0;

        int pontos = pontosDependentes + pontosRendaTotal;

        return pontos;
    }
}
