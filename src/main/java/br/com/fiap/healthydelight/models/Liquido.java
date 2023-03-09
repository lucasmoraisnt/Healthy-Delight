package br.com.fiap.healthydelight.models;

public class Liquido extends Macronutrientes {
    private long id_liquido;
    private String liquido;
    private double kcal;
    private int porcao;

    public long getId_liquido() {
        return id_liquido;
    }

    public void setId_liquido(long id_liquido) {
        this.id_liquido = id_liquido;
    }

    public String getLiquido() {
        return liquido;
    }

    public void setLiquido(String liquido) {
        this.liquido = liquido;
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

    public Liquido() {}

    public Liquido(long id_liquido, String liquido, double kcal, int porcao, double proteina, double gordura,
            double carboidrato) {
        super(proteina, gordura, carboidrato);
        this.id_liquido = id_liquido;
        this.liquido = liquido;
        this.kcal = kcal;
        this.porcao = porcao;
    }

}
