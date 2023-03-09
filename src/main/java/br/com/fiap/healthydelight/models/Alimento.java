package br.com.fiap.healthydelight.models;

public class Alimento extends Macronutrientes {
    private long id_alimento;
    private String alimento;
    private double kcal;
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

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public int getPorcao() {
        return porcao;
    }

    public void setPorcao(int porcao) {
        this.porcao = porcao;
    }

    public Alimento() {}

    public Alimento(long id_alimento, String alimento, double kcal, int porcao, double proteina, double gordura,
            double carboidrato) {
        super(proteina, gordura, carboidrato);
        this.id_alimento = id_alimento;
        this.alimento = alimento;
        this.kcal = kcal;
        this.porcao = porcao;
    }

}
