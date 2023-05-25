package com.Homex.Homex.family.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.Homex.Homex.family.DTO.FamilyRequestDTO;

import com.Homex.Homex.family.models.Dependente;
import com.Homex.Homex.family.models.Family;

import com.Homex.Homex.family.repository.FamilyRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@CrossOrigin(value = "http://localhost:3000/")
@RestController
@RequestMapping("family")
public class FamilyController {
    @Autowired
    private FamilyRepository familyRepository;
 

@GetMapping("/family")
public ResponseEntity<Family> getFamilyById(@PathVariable Long id) {
    Optional<Family> familyOptional = familyRepository.findById(id);
    if (familyOptional.isPresent()) {
        Family family = familyOptional.get();
        return ResponseEntity.ok(family);
    }
    return ResponseEntity.notFound().build();
}
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/family/createWithDependentes")
public ResponseEntity<FamilyRequestDTO> createWithDependentes(@RequestBody FamilyRequestDTO familyDTO) {
    try {
        Family family = new Family(familyDTO);
        family.setRendaTotal(familyDTO.getRendaTotal());
        family.setChefeFamiliar(familyDTO.getChefeFamiliar());

        List<Dependente> dependenteDTOs = familyDTO.getDependentes();
        List<Dependente> dependentes = new ArrayList<>();
        for (Dependente dependenteDTO : dependenteDTOs) {
            Dependente dependente = new Dependente();
            dependente.setIdade(dependenteDTO.getIdade());
            dependente.setNome(dependenteDTO.getNome());
            dependente.setFamily(family);
            dependentes.add(dependente);
        }
        family.setDependentes(dependentes);

        Family savedFamily = familyRepository.save(family);
        Optional<Family> updatedFamilyOptional = familyRepository.findById(savedFamily.getId());
        if (updatedFamilyOptional.isPresent()) {
            Family updatedFamily = updatedFamilyOptional.get();
            FamilyRequestDTO updatedFamilyDTO = new FamilyRequestDTO();

            return ResponseEntity.ok(updatedFamilyDTO);
        }
        return ResponseEntity.notFound().build();
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

}


  




    public class DependenteContoller {

        @PostMapping("/family/dependente")
        public ResponseEntity<Void> addDependente(@PathVariable Long familyId, @RequestBody List<Dependente> dependente) {
            Family family =familyRepository.findById(familyId).orElse(null);
            if (family != null) {
                for (Dependente dependentes : dependente) {
                    ((Dependente) dependente).setFamily(family);
                }
                family.adicionarDependente(dependente);
                familyRepository.save(family);
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    }
}

