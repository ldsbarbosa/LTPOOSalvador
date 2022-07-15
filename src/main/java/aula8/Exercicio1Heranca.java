package aula8;

import java.util.Scanner;

/**
 *2 - Exercícios
    2.1 - Faculdade:
     Crie uma superclasse chamada Funcionários, com as seguintes características:
    i. Nome;
    ii. Endereço;
    iii. Telefone.
     Crie uma subclasse chamada Professor, com as seguintes características:
    i. Disciplina Ministrada (basta uma);
    ii. Valor da hora/aula.
     Crie outra subclasse chamada Administrativo, com as seguintes cartacterísticas:
    i. Cargo;
    ii. Salário.
     Crie uma classe principal que:
    i. Le o nome de um funcionário;
    ii. Usa um switch para que escolha entre professor e administrativo;
    iii. Le e mostra todos os dados de um funcionário com base na opção escolhida.
    * 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio1Heranca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int decisao;
        
        System.out.println("Deseja escolher professor ou administrativo?");
        System.out.println("1 para Professor e 2 para Gestor");
        decisao = leitor.nextInt();
        switch(decisao){
            case 1:
                Professor2 objeto1 = new Professor2();
                System.out.println("Qual o nome do professor?");
                leitor.nextLine();
                objeto1.setNome(leitor.nextLine());
                System.out.println("Qual o telefone do professor?");
                objeto1.setTelefone(leitor.nextLine());
                System.out.println("Qual o endereço do professor?");
                objeto1.setEndereco(leitor.nextLine());
                System.out.println("Qual a disciplina ministrada do professor?");
                objeto1.setDisciplinaMinistrada(leitor.nextLine());
                System.out.println("Qual o valor hora/aula do professor?");
                objeto1.setValorHoraAula(leitor.nextFloat());
                System.out.printf("PROFESSOR: %4s\n",objeto1.getNome());
                System.out.printf("TELEFONE: %4s\n",objeto1.getTelefone());
                System.out.printf("ENDEREÇO: %4s\n",objeto1.getEndereco());
                System.out.printf("DISCIPLINA MINISTRADA: %4s\n",objeto1.getDisciplinaMinistrada());
                System.out.printf("VALOR HORA/AULA: %4.2f\n",objeto1.getValorHoraAula());
                break;
            case 2:
                Administrativo objeto2 = new Administrativo();
                System.out.println("Qual o nome do gestor?");
                leitor.nextLine();
                objeto2.setNome(leitor.nextLine());
                System.out.println("Qual o telefone do gestor?");
                objeto2.setTelefone(leitor.nextLine());
                System.out.println("Qual o endereço do gestor?");
                objeto2.setEndereco(leitor.nextLine());
                System.out.println("Qual o cargo do gestor?");
                objeto2.setCargo(leitor.nextLine());
                System.out.println("Qual o salario do gestor?");
                objeto2.setSalario(leitor.nextFloat());
                System.out.printf("GESTOR: %4s\n",objeto2.getNome());
                System.out.printf("TELEFONE: %4s\n",objeto2.getTelefone());
                System.out.printf("ENDEREÇO: %4s\n",objeto2.getEndereco());
                System.out.printf("CARGO: %4s\n",objeto2.getCargo());
                System.out.printf("SALARIO: %4.2f\n",objeto2.getSalario());
                break;
            default:
                System.out.println("Insira 1 ou 2.");
                break;
        }
    }
}
