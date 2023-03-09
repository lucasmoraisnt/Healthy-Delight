package br.com.fiap.healthydelight.models;

public class Alimento {
    private long id_alimento;
    private String alimento;
    private float kcal;
    private int porcao;
    private float proteina;
    private float gordura;
    private float carboidrato;

    public long getId_alimento() {
        return id_alimento;
    }
    public void setId_alimento(long id_alimento) {
        this.id_alimento = id_alimento;
    }
    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public float getKcal() {
        return kcal;
    }
    public void setKcal(float kcal) {
        this.kcal = kcal;
    }
    public int getPorcao() {
        return porcao;
    }
    public void setPorcao(int porcao) {
        this.porcao = porcao;
    }
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

    public Alimento() {}

    public Alimento(long id_alimento, String alimento, float kcal, int porcao, float proteina, float gordura,
            float carboidrato) {
        this.id_alimento = id_alimento;
        this.alimento = alimento;
        this.kcal = kcal;
        this.porcao = porcao;
        this.proteina = proteina;
        this.gordura = gordura;
        this.carboidrato = carboidrato;
    }

    
    
}
