/*
1) Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que preencha um array com os valores:
c. 1 2 3 4 5 10 20 30 40 50
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exercicio1cLista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int numeroInicial = 1;
        
        System.out.println("Preenchendo um Array! Item c.");
        for(int i = 0; i < (vetor.length/2); i++){
            vetor[i] = numeroInicial+i;
        }
        for(int i = 0; i < vetor.length/2; i++){
            vetor[i+(vetor.length/2)] = (numeroInicial+i)*10;
        }
        System.out.println("Vetor: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+"\t");
        }
    }
}
