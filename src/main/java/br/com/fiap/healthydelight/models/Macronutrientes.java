package br.com.fiap.healthydelight.models;

public class Macronutrientes {
    private double proteina;
    private double gordura;
    private double carboidrato;
    public double getProteina() {
        return proteina;
    }
    public void setProteina(double proteina) {
        this.proteina = proteina;
    }
    public double getGordura() {
        return gordura;
    }
    public void setGordura(double gordura) {
        this.gordura = gordura;
    }
    public double getCarboidrato() {
        return carboidrato;
    }
    public void setCarboidrato(double carboidrato) {
        this.carboidrato = carboidrato;
    }

    public Macronutrientes() {}
    
    public Macronutrientes(double proteina, double gordura, double carboidrato) {
        this.proteina = proteina;
        this.gordura = gordura;
        this.carboidrato = carboidrato;
    }
    
    
}
