package aula5;

import java.util.Scanner;

/**
 *c)    Cria um jogo de adivinhação usando gets e sets. Um primeiro jogador entra com um número,
        depois um segundo jogador terá 5 chances (por exemplo) para acertar o número. Os resultados
        possíveis serão os seguintes:
        - Se o palpite apresentado baixo, o programa deve informar: TENTE UM NÚMERO MAIOR.
        - Se o palpite for alto, o programa deve informar: TENTE UM NÚMERO MENOR.
        - Se for exato deve informar: PARABÉNS!!! ADVINHOU!!!
        - Se ultrapassar as 5 tentativas, o programa deve informar: VOCÊ PERDEU!!!!
 * @author Lucas da Silva Barbosa
 */
public class Exercicio3 {
    public static void main(String args[]) {
        int numeroPrimeiro, numeroSegundo, resultado, tentativas = 1;
        Scanner leitor = new Scanner(System.in);
        Classe3 objeto3 = new Classe3();
        System.out.println("--Jogo de adivinhação!--");

        System.out.println("Primeiro jogador, entre com um número aleatório de 0 a 20!");
        numeroPrimeiro = leitor.nextInt();
        objeto3.setNumeroPrimeiro(numeroPrimeiro);

        System.out.println("Segundo jogador, tente adivinhar o número inserido!");
        System.out.println("O número inserido foi de 0 a 20, incluindo as extremidades.");
        numeroSegundo = leitor.nextInt();
        objeto3.setNumeroSegundo(numeroSegundo);

        resultado = objeto3.adivinhaNumero();

        if(tentativas < 5){
            while(resultado != 1 && tentativas < 5) {
                System.out.println("Tente novamente!");
                numeroSegundo = leitor.nextInt();
                objeto3.setNumeroSegundo(numeroSegundo);
                resultado = objeto3.adivinhaNumero();
                tentativas++;
            }
            if(resultado == 1){
                System.out.println("Você ganhou!");
            }
        }
        if(tentativas >= 5){
            System.out.println("Não há mais tentativas. Você perdeu!");
        }            
    }
}
