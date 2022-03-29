package com.mycompany.instituicao;
import java.util.Random;
import java.util.Scanner;
public class Administrativo implements Controller {//----------------------------------------------------------------ADMINISTRATIVO
    String nome;
    Aluno aluno;
    Professor professor;
    String cursos;

    public Administrativo(String nome, Aluno aluno, Professor professor, String cursos) {
        this.nome = "IFgoiano campus Morrinhos";
        this.aluno = aluno;
        this.professor = professor;
        this.cursos = cursos;
    }
    public Administrativo (String nome, Aluno aluno) {
        this.nome = "IFgoiano campus Morrinhos";
        this.aluno = aluno;
    }
    public Administrativo (String nome, Professor professor) {
        this.nome = "IFgoiano campus Morrinhos";
        this.professor = professor;
    }
    public Administrativo(){
        
    }

    @Override
    public void cadastrarAluno() {
        String nomeAluno = this.aluno.getNome();
        String cpf = this.aluno.getCpf();
        System.out.println("Seja bem vindo ao "+this.nome);
        int matricula = gerarMatricula();
        System.out.println(nomeAluno+" Cadastrado concluido!");
        System.out.println(nomeAluno+" Sua maatricula é: "+matricula); 
        
    }
    @Override
    public void cadastarProfessor() {
        String nomeProf = this.professor.getNome();
        String cpf = this.professor.getCpf();
        System.out.println("Seja bem vindo ao"+this.nome);
        int matricula = gerarMatricula();
       System.out.println(nomeProf+" cadastrado com sucesso! ");
       System.out.println("Sua matricula é:"+matricula);

    }
    @Override
    public int gerarMatricula() {
        Random random = new Random();
        int ano = 202201;
        return (ano +random.nextInt(1000));
        
    }

    @Override
    public void mostarCurso() {
        System.out.println("--------Lista de cursos------");
        System.out.println("1) Graduação");
        System.out.println("2) Pós graduaçao");
        System.out.println("3) Mestrado");
        System.out.println("4) Doutorado");
        System.out.println("5) MBA");
        System.out.println("DIGITE UMA OPÇÃO DE 1 Á 5");
        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
            System.out.println("Analise em sistemas - GRADUAÇÃO");
                break;
            case 2:
            System.out.println("Tecnologia em sistema para internet - PÓS GRADUAÇÃO");
            case 3:
            System.out.println("Desenvolvimento em sites dinamincos - MESTRADO");
                break;
            case 4:
            System.out.println("Ciber segurança - DOUTORADO");
                break;    
            default:
            System.out.println("ULM 'linguage unific model' - MBA");
                break;
        }
        System.out.println("-------------------------------------");
        
    }

    @Override
    public void mostrarDisciplina() {
        System.out.println("Engenhario de software");
        System.out.println("Padrões de projetos");
        System.out.println("Programação Orientada Objetos");
        System.out.println("Teste de software");
        System.out.println("'...'");
        
    }

    
    
    
}

