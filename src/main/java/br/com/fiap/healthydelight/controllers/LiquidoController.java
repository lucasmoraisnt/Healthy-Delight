package br.com.fiap.healthydelight.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.healthydelight.models.Liquido;

@RestController
public class LiquidoController {

    @GetMapping("/api/liquido")
    public String mostraLiquido() {
        Liquido liquido = new Liquido(
                200, 
                "Coca-cola 250ml", 
                106.25, 
                1, 
                0, 
                0, 
                26.25
            );
        return String.format("{id: %s; liquido: %s; kcal: %s; porção: %s; proteina: %s; gordura: %s; carboidrato: %s}",
        liquido.getId_liquido(),liquido.getLiquido(),liquido.getKcal(),liquido.getPorcao(),liquido.getProteina(),liquido.getGordura(),liquido.getCarboidrato());
    }

}
