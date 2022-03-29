package com.mycompany.instituicao;

public abstract class Pessoas {
    String nome;
    String cpf;
    int idade;
    int matricula;
    
    public Pessoas(String nome, String cpf, int idade,int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.matricula = matricula;

    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
