package br.com.fiap.healthydelight.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.healthydelight.models.Alimento;

@RestController
public class AlimentoController {
    
    @GetMapping("/healthydelight/api/alimento")
    public String Alimento(){
        Alimento alimento = new Alimento(
                300, 
                "Hamburguer 100g",
                303,
                1,
                15,
                14,
                30
            );

        return String.format("{id: %s; alimento: %s; kcal: %s; porção: %s; proteina: %s; gordura: %s; carboidrato: %s}",
        alimento.getId_alimento(),alimento.getAlimento(),alimento.getKcal(),alimento.getPorcao(),alimento.getProteina(),alimento.getGordura(),alimento.getCarboidrato());
    }
}
