/*
1) Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que preencha um array com os valores:
b. 0 1 4 9 16 25 36 49 64 81 100
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exercicio1bLista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[11];
        int numeroInicial = 0;
        
        System.out.println("Preenchendo um Array! Item b.");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.pow(numeroInicial,2);
            numeroInicial++;
        }
        System.out.println("Vetor: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+"\t");
        }
    }
}
