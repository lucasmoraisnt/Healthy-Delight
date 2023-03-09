package br.com.fiap.healthydelight.models;

public class Macronutrientes {
    private float proteina;
    private float gordura;
    private float carboidrato;
    
    public float getProteina() {
        return proteina;
    }
    public void setProteina(float proteina) {
        this.proteina = proteina;
    }
    public float getGordura() {
        return gordura;
    }
    public void setGordura(float gordura) {
        this.gordura = gordura;
    }
    public float getCarboidrato() {
        return carboidrato;
    }
    public void setCarboidrato(float carboidrato) {
        this.carboidrato = carboidrato;
    }

    public Macronutrientes() {}

    public Macronutrientes(float proteina, float gordura, float carboidrato) {
        this.proteina = proteina;
        this.gordura = gordura;
        this.carboidrato = carboidrato;
    }
}
