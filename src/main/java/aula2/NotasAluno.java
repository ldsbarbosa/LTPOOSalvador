package aula2;

import java.util.Scanner;

/**
 *e ) Desenvolva um programa em java que lê uma temperatura em graus Celsius, converte para
    graus Fahrenheit e apresenta na tela, seguindo esta fórmula:
    F = (9*C + 160)/5
 * @author Lucas da Silva Barbosa
 */
public class NotasAluno {
    public static void main(String args[]) {
        String aluno;
        float nota1, nota2, nota3, nota4, media;
        Scanner x;
        
        x = new Scanner(System.in);

        System.out.println("Entre com os dados do aluno(Nome e as 4 notas)!");
        
        aluno = x.nextLine();
        nota1 = x.nextFloat();
        nota2 = x.nextFloat();
        nota3 = x.nextFloat();
        nota4 = x.nextFloat();
        
        media = (nota1+nota2+nota3+nota4)/4;

        System.out.printf("A nota do "+aluno);
        System.out.printf(" foi de %.2f",media);
    }
}
