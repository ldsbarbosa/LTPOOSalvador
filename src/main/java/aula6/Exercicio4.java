package aula6;

import java.util.Random;
import java.util.Scanner;

/**
 *6.4 - Exercício d
    Os computadores estão desempenhando um crescente papel na educação. Escreva um programa que
    ajudará um estudante do ensino fundamental a aprender multiplicação. Utilize algum gerador de
    números aleatórios para produzir dois números inteiros positivos. O Programa deve então fazer ao
    usuário o seguinte tipo de pergunta: Quanto é 6 vezes 7? Depois o programa deve ler a resposta e
    informar se o usuário acertou ou não.
    * 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio4 {
    public static void main(String arg[]) {
        Random gerador = new Random();
        Scanner leitor = new Scanner(System.in);
        int num1, num2, resposta;

        System.out.println("--Aprenda Multiplicação!--");
        num1 = gerador.nextInt(20);
        num2 = gerador.nextInt(20);
        
        System.out.printf("Quanto é %d vezes %d?\n", num1, num2);
        resposta = leitor.nextInt();
        
        if(num1*num2 == resposta) {
            System.out.println("Acertou!");
        }else {
            System.out.println("Errou. :-(");
        }
    }
}
