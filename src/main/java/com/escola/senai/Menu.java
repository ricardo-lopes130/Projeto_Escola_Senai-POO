package com.escola.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

    public static List<Aluno> listaAluno = new ArrayList<>();
    public static List<Professor> listaProfessor = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void menuAluno(){
    
        int opcao;

            do{
            

            System.out.println(" ____________ * MENU ALUNO * __________ ");
            System.out.println("[1]-CADASTRAR ALUNO\n [2]-ATUALIZAR ALUNO\n [3]-DELETAR ALUNO\n [4]-LISTAR ALUNOS\n [0]-SAIR\n");
            System.out.println("Digite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                cadastrarAluno();
                break;

                case 2:
                atualizarAluno();
                break;

                case 3:
                removerAluno();
                break;

                case 4:
                listarAluno();
                break;

                case 0:
                System.out.println("Programa Finalizado!\n");
                break;

                default:
                System.out.println("Opção Inválida.");
                break;
                    }
                }while(opcao !=0);  
            }

    public static void cadastrarAluno(){
        System.out.println("[1]- *CADASTRAR NOVO ALUNO* ");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        listaAluno.add(aluno);
        System.out.println("ALUNO CADASTRADO.");
    }   

    public static void atualizarAluno(){
        System.out.println("[2]- *ATUALIZAR ALUNO* ");
        System.out.println("Digite o nome do aluno que deseja atualizar: ");
        String nomeAtualizar =  sc.nextLine();
        int contador = 0;

        for(Aluno aluno : listaAluno) {
            if(aluno.getNome().equals(nomeAtualizar)){
                System.out.println("Digite o novo nome do aluno que deseja atualizar: ");
                String nome = sc.nextLine();
                    aluno.setNome(nome);
                    System.out.println("Aluno modificado com sucesso.");
                    contador = 0;
                }else{
                    contador++;
                }
            }
            if(contador == listaAluno.size()){
                System.out.println("Aluno nao encontrado.");
            }      
        }
    
        public static void removerAluno(){
            System.out.println("   Remover o Aluno   ");
            System.out.print("Nome do Aluno que deseja remover: ");
            String remover = sc.nextLine();
            int contador = 0;

            for (int i = 0; i < listaAluno.size(); i++) {
                if (listaAluno.get(i).getNome().equals(remover)) {
                    listaAluno.remove(i);
                    System.out.println("Aluno removido com sucesso");
                    contador = 0;
                }else{
                    contador++;
                }
            }
            if(contador == listaAluno.size()){
                System.out.println("Aluno nao encontrado");
            }
        }
    
        public static void listarAluno(){
            System.out.println("   Lista dos Aluno   ");
            if(listaAluno.isEmpty()){
                System.out.println("   Lista Vazia   ");
            }else{
                for (int i = 0; i < listaAluno.size(); i++) {
                    Aluno aluno = listaAluno.get(i);
                    System.out.println((i + 1) + "- " + aluno.getNome());
                }
            }    
        }
    

    public static void menuProfessor(){

        int opcao;

        do {
            System.out.println(" ____________ * MENU PROFESSOR * __________ ");
            System.out.println("[1]-CADASTRAR PROFESSOR\n [2]-ATUALIZAR PROFESSOR\n [3]-DELETAR PROFESSOR\n [4]-LISTAR PROFESSORES\n [0]-SAIR\n");
            System.out.println("Digite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                cadastrarProfessor();
                break;

                case 2:
                atualizarProfessor();
                break;

                case 3:
                removerProfessor();
                break;

                case 4:
                listarProfessor();
                break;

                case 0:
                System.out.println("Programa Finalizado!\n");
                break;

                default:
                System.out.println("Opção Inválida.");
                break;
                }
            } while (opcao != 0);
        }

        public static void cadastrarProfessor(){
            System.out.println("[1]- *CADASTRAR NOVO PROFESSOR* ");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            Professor professor = new Professor();
            professor.setNome(nome);
            listaProfessor.add(professor);
            System.out.println("PROFESSOR CADASTRADO.");
        }
    
        public static void atualizarProfessor(){
            System.out.println("[2]- *ATUALIZAR PROFESSOR* ");
            System.out.println("Digite o nome do professor que deseja atualizar: ");
            String nomeAtualizar =  sc.nextLine();
            int contador = 0;
    
            for(Professor professor : listaProfessor) {
                if(professor.getNome().equals(nomeAtualizar)){
                    System.out.println("Digite o novo nome do professor que deseja atualizar: ");
                    String nome = sc.nextLine();
                        professor.setNome(nome);
                        System.out.println("Professor modificado com sucesso.");
                        contador = 0;
                    }else{
                        contador++;
                    }
                }
                if(contador == listaProfessor.size()){
                    System.out.println("Professor nao encontrado.");
                }      
            }
        
            public static void removerProfessor(){
                System.out.println("   Remover o Professor   ");
                System.out.print("Nome do Professor que deseja remover: ");
                String remover = sc.nextLine();
                int contador = 0;
    
                for (int i = 0; i < listaProfessor.size(); i++) {
                    if (listaProfessor.get(i).getNome().equals(remover)) {
                        listaProfessor.remove(i);
                        System.out.println("Professor removido com sucesso");
                        contador = 0;
                    }else{
                        contador++;
                    }
                }
                if(contador == listaProfessor.size()){
                    System.out.println("Professor nao encontrado");
                }
            }
        
            public static void listarProfessor(){
                System.out.println("   Lista dos Professor   ");
                if(listaProfessor.isEmpty()){
                    System.out.println("   Lista Vazia   ");
                }else{
                    for (int i = 0; i < listaProfessor.size(); i++) {
                        Professor professor = listaProfessor.get(i);
                        System.out.println((i + 1) + "- " + professor.getNome());
                    }
                }    
            }      
        }




