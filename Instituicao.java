/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.instituicao;
import java.util.Scanner;
/**
 *
 * @author decas
 */
public class Instituicao {

    public static void main(String[] args) {
        
        Administrativo adm = new Administrativo();
        
        Scanner scan = new Scanner(System.in);
        
        boolean teste = true;
    
        while(teste){
        scan.nextLine();

        System.out.println("1) Cadastar Aluno");
        System.out.println("2) Cadastrar Professor");
        System.out.println("3) Mostar Cursos");
        System.out.println("4) Mostar Disciplinas");
        System.out.println("0) Sair");
        
        int in = scan.nextInt();
            switch (in) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = scan.next();
                    Aluno aluno = new Aluno(nome, "123456", 0, 0);
                    adm = new Administrativo("Ifgoiano", aluno);
                    adm.cadastrarAluno();
                    break;
                case 2:
                    System.out.println("Digite seu nome: ");
                    nome = scan.next();
                    Professor prf = new Professor(nome,"777", 25, 9999);
                    adm = new Administrativo("Ifgoiano", prf);
                    adm.cadastarProfessor();
                    break;
                case 3:
                    adm.mostarCurso();
                   break;
                case 4:
                    adm.mostrarDisciplina();
                    break;
                case 0:
                System.out.println("Você saiu do programa...");
                teste = false;
                break;
            }
            
            
        }
        scan.close();
    }
    
    
}


    
   
    
   
   








