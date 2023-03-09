package br.com.fiap.healthydelight.models;

//Ctrl + . - da opção de gerar os construturores e getters e setters

public class Pessoa {
    private long id_pessoa;
    private String nome;
    private double peso;
    private double altura;
    private double imc;
    private int idade;
    private String sexo;
    
    public long getId_pessoa() {
        return id_pessoa;
    }
    public void setId_pessoa(long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa() {}
    
    public Pessoa(long id_pessoa, String nome, double peso, double altura, double imc, int idade, String sexo) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.idade = idade;
        this.sexo = sexo;
    }

    
}
