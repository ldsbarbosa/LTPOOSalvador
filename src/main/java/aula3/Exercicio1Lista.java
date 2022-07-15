package aula3;

import java.util.Scanner;

/**
 * 1. Desenvolva:
         Uma classe com um método principal que pergunta se o usuário quer ler um ângulo em
        radianos e converter para graus (opção 1) ou se quer ler um ângulo em radianos e
        converter para graus (opção 2). Use um if para chama o método grausParaRadianos()
        ou radianosParaGraus(), ambos da classe Converte.
         Uma classe chamada Converte, com dois métodos. Um chamado grausParaRadianos()
        que lê um ângulo em graus e converte para radianos e mostra o resultado. E outro
        método chamado radianosParaGraus(), que lê um ângulo em radianos e converte para
        graus e mostra o resultado.
        Lembre-se, 180 graus equivale a 3,141593 radianos.
 * @author  Lucas da Silva Barbosa
 */
public class Exercicio1Lista {
    public static void main(String args[]) {
        Converte caju = new Converte();
        Scanner leitor = new Scanner(System.in);
        int decisao;
        System.out.println("Se desejar converter radianos para graus, digite 1.");
        System.out.println("Caso seja a operação inversa, digite 2.");
        decisao = leitor.nextInt();
        if(decisao == 1)
            caju.radianosParaGraus();
        if(decisao == 2)
            caju.grausParaRadianos();
    }
}
