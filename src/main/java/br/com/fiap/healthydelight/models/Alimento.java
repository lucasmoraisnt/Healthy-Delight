package br.com.fiap.healthydelight.models;

public class Alimento extends Macronutrientes{
    private long id_alimento;
    private String alimento;
    private float kcal;
    private int porcao;

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
    
    public Alimento() {}

    public Alimento(float proteina, float gordura, float carboidrato, long id_alimento, String alimento, float kcal,
            int porcao) {
        super(proteina, gordura, carboidrato);
        this.id_alimento = id_alimento;
        this.alimento = alimento;
        this.kcal = kcal;
        this.porcao = porcao;
    }
}
