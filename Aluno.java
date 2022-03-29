package com.mycompany.instituicao;


    public class Aluno extends Pessoas {//-------------------------------------------------------ALUNO

        String turma;
        String disciplina;

        public Aluno(String nome, String cpf, int idade, int matricula) {
            super(nome, cpf, idade, matricula);
            //TODO Auto-generated constructor stub
        }

        public String getTurma() {
            return turma;
        }

        public void setTurma(String turma) {
            this.turma = turma;
        }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

        
}
